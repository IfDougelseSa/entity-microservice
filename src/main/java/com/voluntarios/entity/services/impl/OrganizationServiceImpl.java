package com.voluntarios.entity.services.impl;

import com.voluntarios.entity.dtos.OrganizationDTO;
import com.voluntarios.entity.mappers.OrganizationMapper;
import com.voluntarios.entity.repositories.OrganizationRepository;
import com.voluntarios.entity.services.IOrganizationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrganizationServiceImpl implements IOrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    @Transactional
    public void create(OrganizationDTO organizationDTO) {

        organizationRepository.save(OrganizationMapper.toEntity(organizationDTO));
    }
}
