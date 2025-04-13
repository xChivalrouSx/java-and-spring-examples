package com.chivalrous.service.validation.service;

import com.chivalrous.service.validation.annotation.ValidateArgs;
import com.chivalrous.service.validation.dto.EchoRequest;
import org.springframework.stereotype.Service;

@Service
public class EchoService {

    @ValidateArgs
    public String echo(EchoRequest request) {
        return request.getMessage().repeat(request.getTimes());
    }
}
