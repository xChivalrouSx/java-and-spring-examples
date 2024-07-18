package com.chivalrous.map.struct.example.service;

import org.springframework.stereotype.Service;

import com.chivalrous.map.struct.example.dto.CustomEchoRequest;
import com.chivalrous.map.struct.example.dto.CustomEchoResponse;
import com.chivalrous.map.struct.example.mapper.CustomEchoMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomEchoService {

    private final CustomEchoMapper customEchoMapper;

    public CustomEchoResponse doCustomEcho(CustomEchoRequest request) {
        return customEchoMapper.requestToResponse(request);
    }

}
