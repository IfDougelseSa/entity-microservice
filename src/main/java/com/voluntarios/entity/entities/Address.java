package com.voluntarios.entity.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String zipCode;
    private String street;
    private String neighborhood;
    private String state;
    private String city;

    @OneToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
