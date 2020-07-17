package com.live;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.live.config.AppConfig;
import com.live.repository.ProductRepository;
import com.live.service.ProductService;
import com.live.service.ProductServiceImpl;

//Annotation providing a convenient and declarative mechanism for adding a PropertySource to Spring's Environment. 
//To be used in conjunction with @Configuration classes. 
@PropertySource("classpath:product-service.properties")
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductRepository productRepository;

		// accessing bean with implicit bean name
		// productRepository = (ProductRepository)context.getBean("oracleRepository");	
		productRepository = context.getBean("productRepository", ProductRepository.class);
		productRepository.getProducts().forEach(System.out::println);
		
		ProductService productService = context.getBean("productService", ProductServiceImpl.class);
		System.out.println("Properties File : " + productService.getDomain());
		// context.close();
	}
}
