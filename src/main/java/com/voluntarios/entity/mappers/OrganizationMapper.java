package com.voluntarios.entity.mappers;

import com.voluntarios.entity.dtos.OrganizationDTO;
import com.voluntarios.entity.entities.*;

import java.util.stream.Collectors;

public class OrganizationMapper {

    public static Organization toEntity(OrganizationDTO dto) {
        if (dto == null) {
            return null;
        }

        Organization organization = new Organization();
        organization.setFantasyName(dto.getFantasyName());
        organization.setSocialReason(dto.getSocialReason());
        organization.setCnpj(dto.getCnpj());
        organization.setDescription(dto.getDescription());
        organization.setTotalVolunteers(dto.getTotalVolunteers());
        organization.setVolunteersNeeded(dto.getVolunteersNeeded());
        organization.setActive(dto.isActive());
        organization.setTalkTo(dto.getTalkTo());
        organization.setAcceptedDonationItems(dto.getAcceptedDonationItems());
        organization.setDonationDetails(dto.getDonationDetails());

        // Convert contacts
        if (dto.getContacts() != null) {
            organization.setContacts(dto.getContacts().stream()
                    .map(contactDTO -> {
                        Contact contact = new Contact();
                        contact.setType(contactDTO.getType());
                        contact.setPrefix(contactDTO.getPrefix());
                        contact.setTelephone(contactDTO.getTelephone());
                        contact.setEmail(contactDTO.getEmail());
                        contact.setOrganization(organization);
                        return contact;
                    })
                    .collect(Collectors.toList()));
        }

        // Convert social media
        if (dto.getSocialMedia() != null) {
            SocialMedia socialMedia = new SocialMedia();
            socialMedia.setWebsite(dto.getSocialMedia().getWebsite());
            socialMedia.setFacebook(dto.getSocialMedia().getFacebook());
            socialMedia.setInstagram(dto.getSocialMedia().getInstagram());
            socialMedia.setTwitter(dto.getSocialMedia().getTwitter());
            socialMedia.setYoutube(dto.getSocialMedia().getYoutube());
            socialMedia.setOrganization(organization);
            organization.setSocialMedia(socialMedia);
        }

        // Convert responsible
        if (dto.getResponsible() != null) {
            Responsible responsible = new Responsible();
            responsible.setFirstName(dto.getResponsible().getFirstName());
            responsible.setLastName(dto.getResponsible().getLastName());
            responsible.setRole(dto.getResponsible().getRole());
            responsible.setOrganization(organization);
            organization.setResponsible(responsible);
        }

        // Convert address
        if (dto.getAddress() != null) {
            Address address = new Address();
            address.setStreet(dto.getAddress().getStreet());
            address.setNeighborhood(dto.getAddress().getNeighborhood());
            address.setCity(dto.getAddress().getCity());
            address.setState(dto.getAddress().getState());
            address.setZipCode(dto.getAddress().getZipCode());
            address.setOrganization(organization);
            organization.setAddress(address);
        }

        return organization;
    }
}