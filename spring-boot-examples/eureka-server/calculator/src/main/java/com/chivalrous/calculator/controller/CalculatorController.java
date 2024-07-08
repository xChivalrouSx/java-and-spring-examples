package com.chivalrous.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @GetMapping("/sum")
    public String add(@RequestParam int firstValue, @RequestParam int secondValue) {
        return firstValue + " + " + secondValue + " = " + (firstValue + secondValue);
    }

}
