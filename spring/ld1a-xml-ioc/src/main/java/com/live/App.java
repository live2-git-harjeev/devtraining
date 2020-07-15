package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.repository.ProductRepository;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Enterprise Application starter!" );
//        ProductService productService = new ProductServiceImpl();
//        productService.getProducts().forEach(System.out::println);
    	
//    	ProductRepository productRepository = new OracleRepository();
    	ProductRepository productRepository = null;
    	
//    	Load the spring container
//    	The spring container would use the applicationContext.xml to configure the spring beans
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//Access the spring bean from the application
    	productRepository = (ProductRepository)context.getBean("productRepository");
    	productRepository.getProducts().forEach(System.out::println);
    }
}
