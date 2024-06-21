package com.voluntarios.entity.controllers;

import com.voluntarios.entity.dtos.OrganizationInfoDto;
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
    private OrganizationInfoDto organizationInfoDto;


    @GetMapping("/contact-info")
    public ResponseEntity<OrganizationInfoDto> getContactInfo() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(organizationInfoDto);
    }
}
