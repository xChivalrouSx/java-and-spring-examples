package com.chivalrous.service.validation.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EchoRequest {

    @NotBlank(message = "message must not be blank")
    private String message;

    @Min(value = 1, message = "times must be greater than or equal to 1")
    private int times;

}
