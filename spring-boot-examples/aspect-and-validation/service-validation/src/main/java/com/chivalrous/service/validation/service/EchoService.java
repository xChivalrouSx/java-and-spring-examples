package com.chivalrous.service.validation.service;

import com.chivalrous.service.validation.annotation.ValidateArgs;
import com.chivalrous.service.validation.dto.EchoRequest;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class EchoService {

    @ValidateArgs
    public String echo(EchoRequest request) {
        return request.getMessage().repeat(request.getTimes());
    }

    public String echoV2(@NotBlank String message, @Min(value = 1) int times) {
        return message.repeat(times);
    }

}
