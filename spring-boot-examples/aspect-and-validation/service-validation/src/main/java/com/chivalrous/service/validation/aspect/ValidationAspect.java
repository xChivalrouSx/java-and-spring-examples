package com.chivalrous.service.validation.aspect;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class ValidationAspect {

    private final Validator validator;

    @Around("@annotation(com.chivalrous.service.validation.annotation.ValidateArgs)")
    public Object validateInput(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("validation aspect triggered");
        Object[] args = joinPoint.getArgs(); // Get method arguments

        StringBuilder builder = new StringBuilder();
        for (Object arg : args) {
            if (arg != null) {
                BindingResult bindingResult = new BindException(arg, "arg");
                validator.validate(arg, bindingResult);

                if (bindingResult.hasErrors()) {
                    for (FieldError error : bindingResult.getFieldErrors()) {
                        builder.append(error.getField()).append(": ").append(error.getDefaultMessage()).append("\n");
                    }
                }
            }
        }

        if(StringUtils.hasText(builder.toString())) {
            throw new IllegalArgumentException("Validation error: \n" + builder.toString());
        }

        return joinPoint.proceed();
    }
}
