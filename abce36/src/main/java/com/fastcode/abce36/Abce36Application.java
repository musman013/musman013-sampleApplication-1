package com.fastcode.abce36;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fastcode.abce36"})
public class Abce36Application {

	public static void main(String[] args) {
		SpringApplication.run(Abce36Application.class, args);
	}

}

