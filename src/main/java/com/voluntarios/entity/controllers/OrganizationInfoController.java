package com.voluntarios.entity.controllers;

import com.voluntarios.entity.dtos.EntityInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class OrganizationInfoController {

    @Autowired
    private EntityInfoDto entityInfoDto;


    @GetMapping("/contact-info")
    public ResponseEntity<EntityInfoDto> getContactInfo() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(entityInfoDto);
    }
}
