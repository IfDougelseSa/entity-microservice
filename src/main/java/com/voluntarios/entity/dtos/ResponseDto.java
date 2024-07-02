package com.voluntarios.entity.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ResponseDto {
    private String statusCode;

    private String statusMsg;
}