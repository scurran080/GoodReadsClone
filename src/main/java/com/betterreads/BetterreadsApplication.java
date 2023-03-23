package com.betterreads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.betterreads")
@ComponentScan(basePackages = "com.betterreads")
@EnableJpaRepositories(basePackages = "com.betterreads")
@EnableWebMvc
public class BetterreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetterreadsApplication.class, args);
	}

}
