package com.voluntarios.entity.dtos;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ErrorResponseDTO {

    private  String apiPath;


    private HttpStatus errorCode;


    private  String errorMessage;


    private LocalDateTime errorTime;

}