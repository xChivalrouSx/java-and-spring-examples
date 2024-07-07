package com.chivalrous.service.to.request.controller;

import org.springframework.web.bind.annotation.RestController;

import com.chivalrous.service.to.request.service.HealthService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequiredArgsConstructor
public class HealthController {

    private final HealthService healthService;

    @GetMapping("/health/{name}")
    public String getMethodName(@PathVariable String name) {
        return healthService.createHealthResponse(name);
    }
    

}
