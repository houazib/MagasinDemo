package com.magasin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class MagasinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagasinDemoApplication.class, args);
	}
	
}
