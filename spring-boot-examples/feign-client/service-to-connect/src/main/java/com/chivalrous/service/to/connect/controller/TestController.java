package com.chivalrous.service.to.connect.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {

    @GetMapping("/echo")
    public String doEcho(@RequestParam(defaultValue = "") String value) {
        return " - (Result from echo service) " + value + " - ";
    }
    
}
