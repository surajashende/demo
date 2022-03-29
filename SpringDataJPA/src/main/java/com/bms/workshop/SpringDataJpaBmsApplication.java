package com.bms.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.bms.workshop")
@EnableJpaRepositories(basePackages = "com.bms.workshop.repository")
@EntityScan(basePackages = "com.bms.workshop.model")
public class SpringDataJpaBmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaBmsApplication.class, args);
	}

}
