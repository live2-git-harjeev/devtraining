package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.repository.ProductRepository;

public class App 
{
    public static void main( String[] args )
    {
//performIOC();
    	testSingleton();
    }

	private static void performIOC() {
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
		    	
		    	ProductRepository mySqlRepository = null;
		    	mySqlRepository = context.getBean("mySqlRepository", ProductRepository.class);
		    	mySqlRepository.getProducts().forEach(System.out::println);
		    	
		    	//Testing for singletons
		    	System.out.println(productRepository);
	}
	private static void testSingleton() {
		ProductRepository productRepository = null;
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//Access the spring bean from the application for the first time
    	productRepository = (ProductRepository)context.getBean("productRepository");
    	System.out.println(productRepository);
    	
    	//Access the spring bean from the application for the second time
    	productRepository = (ProductRepository)context.getBean("productRepository");
    	System.out.println(productRepository);

	}
}
