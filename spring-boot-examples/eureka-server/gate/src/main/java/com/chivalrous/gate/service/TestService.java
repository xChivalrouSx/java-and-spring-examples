package com.chivalrous.gate.service;

import org.springframework.stereotype.Service;

import com.chivalrous.gate.client.CalculatorClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

    private final CalculatorClient calculatorClient;

    public String testCalculate(int firstValue, int secondValue) {
        return calculatorClient.add(firstValue, secondValue);
    }

}
