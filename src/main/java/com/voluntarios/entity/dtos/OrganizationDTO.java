package com.voluntarios.entity.dtos;

import com.voluntarios.entity.entities.DonationItem;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class OrganizationDTO {
    private Long organizationId;
    private String fantasyName;
    private String socialReason;
    private String cnpj;
    private String description;
    private int totalVolunteers;
    private int volunteersNeeded;
    private boolean active;
    private String talkTo;

    private List<ContactDTO> contacts;
    private SocialMediaDTO socialMedia;
    private ResponsibleDTO responsible;
    private AddressDTO address;
    private Set<DonationItem> acceptedDonationItems;
    private String donationDetails;

    // Nested DTOs for related entities
    @Data
    public static class ContactDTO {
        private Long contactId;
        private String telephone;
        private String email;
    }

    @Data
    public static class SocialMediaDTO {
        private Long id;
        private String website;
        private String facebook;
        private String instagram;
        private String twitter;
        private String youtube;
    }

    @Data
    public static class ResponsibleDTO {
        private Long id;
        private String firstName;
        private String lastName;
        private String role;
    }

    @Data
    public static class AddressDTO {
        private Long id;
        private String street;
        private String number;
        private String neighborhood;
        private String city;
        private String state;
        private String zipCode;
    }
}