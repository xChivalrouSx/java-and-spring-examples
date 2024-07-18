package com.chivalrous.map.struct.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.chivalrous.map.struct.example.dto.CustomEchoRequest;
import com.chivalrous.map.struct.example.dto.CustomEchoResponse;
import com.chivalrous.map.struct.example.service.CustomEchoService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
public class CustomEchoController {

    private final CustomEchoService customEchoService;

    @PostMapping("/custom-echo")
    public ResponseEntity<CustomEchoResponse> doCustomEcho(@RequestBody CustomEchoRequest request) {
        return ResponseEntity.ok(customEchoService.doCustomEcho(request));
    }
    

}
