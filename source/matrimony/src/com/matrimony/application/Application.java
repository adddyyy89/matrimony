package com.matrimony.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matrimony.hibernate.Hibernate;

@SpringBootApplication
public class Application {
	public static final String baseURL = "/matrimony/website/api";

	public static void main(String[] args) {
		Hibernate.initialize();
		SpringApplication.run(Application.class, args);
	}
}
