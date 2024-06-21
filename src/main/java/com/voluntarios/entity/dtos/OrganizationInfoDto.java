package com.voluntarios.entity.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "entity")
public class OrganizationInfoDto {

    private String message;

}
