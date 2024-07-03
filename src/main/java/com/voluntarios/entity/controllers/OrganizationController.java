package com.voluntarios.entity.controllers;

import com.voluntarios.entity.constants.Constants;
import com.voluntarios.entity.dtos.OrganizationDTO;
import com.voluntarios.entity.dtos.ResponseDTO;
import com.voluntarios.entity.services.IOrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/organization", produces = {MediaType.APPLICATION_JSON_VALUE})
public class OrganizationController {

    private final IOrganizationService organizationService;

    public OrganizationController(IOrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> create(@RequestBody OrganizationDTO organizationDTO) {
        organizationService.create(organizationDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDTO(Constants.STATUS_200, Constants.MESSAGE_200));
    }
}
