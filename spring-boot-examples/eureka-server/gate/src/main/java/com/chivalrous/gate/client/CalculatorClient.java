package com.chivalrous.gate.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "CALCULATOR", path = "/calculate")
public interface CalculatorClient {

    @GetMapping("/sum")
    public String add(@RequestParam int firstValue, @RequestParam int secondValue);

}
