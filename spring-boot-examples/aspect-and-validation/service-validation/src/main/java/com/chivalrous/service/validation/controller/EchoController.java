package com.chivalrous.service.validation.controller;

import com.chivalrous.service.validation.dto.EchoRequest;
import com.chivalrous.service.validation.service.EchoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EchoController {

    private final EchoService echoService;

    @GetMapping("/echo")
    public String echo(@ModelAttribute EchoRequest request) {
        return echoService.echo(request);
    }

    @GetMapping("/v2/echo")
    public String echoV2(@ModelAttribute EchoRequest request) {
        return echoService.echoV2(request.getMessage(), request.getTimes());
    }

}
