package com.voluntarios.entity.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SocialMedia extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long socialMediaId;
    private String website;
    private String facebook;
    private String instagram;
    private String twitter;
    private String youtube;

    @OneToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
