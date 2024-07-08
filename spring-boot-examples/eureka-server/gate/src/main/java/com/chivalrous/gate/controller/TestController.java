package com.chivalrous.gate.controller;

import org.springframework.web.bind.annotation.RestController;

import com.chivalrous.gate.service.TestService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("test/{firstValue}/{secondValue}")
    public String getMethodName(@PathVariable int firstValue, @PathVariable int secondValue) {
        return testService.testCalculate(firstValue, secondValue);
    }

}
