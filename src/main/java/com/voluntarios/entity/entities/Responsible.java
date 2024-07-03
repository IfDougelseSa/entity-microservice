package com.voluntarios.entity.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Responsible extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responsibleId;
    private String firstName;
    private String lastName;
    private String role;

    @OneToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
