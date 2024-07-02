package com.voluntarios.entity.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Contact extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;
    private String telephone;
    private String email;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
