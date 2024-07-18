package com.chivalrous.map.struct.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomEchoRequest {

    private String id;
    private String secretMessage;
    private String publicMessage;
    private CustomInnerObject innerObject;
}
