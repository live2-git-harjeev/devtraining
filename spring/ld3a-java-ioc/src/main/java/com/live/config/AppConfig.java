package com.live.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Indicates that a class declares one or more @Bean methods and
//may be processed by the Spring container to generate bean definitions
@Configuration
//Configures component scanning directives for use with @Configuration classes.
@ComponentScan("com.live")
public class AppConfig {

}
