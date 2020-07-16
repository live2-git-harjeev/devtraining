package com.live;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.live.config.AppConfig;
import com.live.repository.ProductRepository;

public class App 
{
    public static void main( String[] args )
    {
		    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		    	ProductRepository productRepository;
		    	
		    	//accessing bean with implicit bean name
//		    	productRepository = (ProductRepository)context.getBean("oracleRepository");	
		    			    	productRepository = context.getBean("oracleRepository",ProductRepository.class);	
		    	productRepository.getProducts().forEach(System.out::println);
		    	//context.close();
    }
}
