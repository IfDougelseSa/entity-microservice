package com.voluntarios.entity.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(prefix = "entity")
public class EntityInfoDTO {

    private String message;

    private Map<String, String> contactDetails = new LinkedHashMap<>();
}
