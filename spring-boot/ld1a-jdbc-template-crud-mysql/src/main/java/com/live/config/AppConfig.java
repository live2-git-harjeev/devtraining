package com.live.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.live")
@PropertySource("classpath:database-mysql.properties")
public class AppConfig {

	@Autowired
	Environment environment;
	
	@Bean
	DataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(environment.getProperty("driver"));
		datasource.setUrl(environment.getProperty("url"));
		datasource.setUrl(environment.getProperty("username"));
		datasource.setUrl(environment.getProperty("password"));
		return datasource;
	}
}
