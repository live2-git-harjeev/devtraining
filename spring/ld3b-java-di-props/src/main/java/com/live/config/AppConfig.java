package com.live.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.live.repository.OracleRepository;
import com.live.repository.ProductRepository;
import com.live.service.ProductService;
import com.live.service.ProductServiceImpl;

//Indicates that a class declares one or more @Bean methods and
//may be processed by the Spring container to generate bean definitions
@Configuration
//Configures component scanning directives for use with @Configuration classes.
//@ComponentScan("com.live")
public class AppConfig {
//	<bean id="productRepository" class="com.live.repository.OracleRepository" />	
	@Bean
	public ProductRepository productRepository(){
		return new OracleRepository();
	}
	@Bean
	public ProductService productService() {
		return new ProductServiceImpl(productRepository());
	}
}
