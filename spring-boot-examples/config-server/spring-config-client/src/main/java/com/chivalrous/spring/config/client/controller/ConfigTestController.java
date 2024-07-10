package com.chivalrous.spring.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {

    @Value("${test.value.to.get}")
    private String configServerTestValue;

    @GetMapping("/test")
    public String test() {
        return configServerTestValue;
    }

}
