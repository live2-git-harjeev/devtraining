package com.live;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Disable default spring security
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
