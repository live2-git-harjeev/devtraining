package com.live;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Ld6aSbSecurityAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ld6aSbSecurityAuthenticationApplication.class, args);
	}
}
