package com.chivalrous.map.struct.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomEchoResponse {

    private String id;
    private String publicMessage;
    private String innerId;

}
