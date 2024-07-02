package com.voluntarios.entity;

import com.voluntarios.entity.dtos.EntityInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {EntityInfoDto.class})
public class EntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntityApplication.class, args);
	}

}
