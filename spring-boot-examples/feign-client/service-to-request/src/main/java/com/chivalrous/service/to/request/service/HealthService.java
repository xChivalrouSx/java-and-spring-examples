package com.chivalrous.service.to.request.service;

import org.springframework.stereotype.Service;

import com.chivalrous.service.to.request.client.EchoClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HealthService {

    private final EchoClient echoClient;

    public String createHealthResponse(String name) {
        String responseFromEcho = echoClient.doEcho(name);
        return "Hello " + name + "!.. Service is up and running..." + responseFromEcho;
    }

}
