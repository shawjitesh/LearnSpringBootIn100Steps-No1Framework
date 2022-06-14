package com.example.springboot.firstspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class FirstSpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootProjectApplication.class, args);
	}

	@Profile("dev")
	@Bean
	public void doSomething() {
		System.out.println("Dummy");
	}
}
