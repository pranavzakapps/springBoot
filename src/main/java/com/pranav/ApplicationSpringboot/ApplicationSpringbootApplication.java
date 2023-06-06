package com.pranav.ApplicationSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages = {"com.pranav.ApplicationSpringboot","com.pranav.ApplicationSpringboot.Controller",
		"com.pranav.ApplicationSpringboot.Entity","com.pranav.ApplicationSpringboot.Repository"
		,"com.pranav.ApplicationSpringboot.Service"})
public class ApplicationSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSpringbootApplication.class, args);
	}

}
