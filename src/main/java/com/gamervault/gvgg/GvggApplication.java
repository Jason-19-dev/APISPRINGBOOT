package com.gamervault.gvgg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.gamervault.gvgg.models")
@EntityScan(basePackageClasses = { GvggApplication.class, Jsr310Converters.class })
@EnableJpaRepositories(basePackages = "com.gamervault.gvgg.repository")

@SpringBootApplication
public class GvggApplication {

	public static void main(String[] args) {
		SpringApplication.run(GvggApplication.class, args);
	}

}
