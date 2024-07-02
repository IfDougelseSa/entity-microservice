package com.voluntarios.entity.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Organization extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long organizationId;
    private String fantasyName;
    private String socialReason;
    private String cnpj;
    private String description;
    private int totalVolunteers;
    private int volunteersNeeded;
    private boolean active;
    private String talkTo;


    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();

    @OneToOne(mappedBy = "organization", cascade = CascadeType.ALL)
    private SocialMedia socialMedia;

    @OneToOne(mappedBy = "organization", cascade = CascadeType.ALL)
    private Responsible responsible;

    @OneToOne(mappedBy = "organization", cascade = CascadeType.ALL)
    private Address address;

    @ElementCollection(targetClass = DonationItem.class)
    @CollectionTable(name = "organization_donation_items", joinColumns = @JoinColumn(name = "organization_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "donation_item")
    private Set<DonationItem> acceptedDonationItems = new HashSet<>();

    @Column(length = 2000)
    private String donationDetails;
}
