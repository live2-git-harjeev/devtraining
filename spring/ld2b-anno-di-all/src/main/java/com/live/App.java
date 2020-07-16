package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.service.ProductService;

public class App 
{
    public static void main( String[] args )
    {
		//    	Load the spring container
		//    	The spring container would use the applicationContext.xml to configure the spring beans
		    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		    	ProductService productService = context.getBean("productService",ProductService.class);
		    	productService.getProducts().forEach(System.out::println);
		    	
		    	//		    	ProductRepository productRepository;
		    	//Access the spring bean from the application
		    	//accessing bean with explicit bean name
		    	//productRepository = (ProductRepository)context.getBean("productRepository");	
		    	
		    	//accessing bean with implicit bean name
//		    	productRepository = (ProductRepository)context.getBean("oracleRepository");	
//		    	productRepository.getProducts().forEach(System.out::println);
//		    	context.close();
    }
}
