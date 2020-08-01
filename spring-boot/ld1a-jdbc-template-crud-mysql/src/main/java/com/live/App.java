package com.live;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.live.config.AppConfig;
import com.live.model.Product;
import com.live.repository.ProductRepository;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "SPRING JDBC TEMPLATE");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        List<Product> products = productRepository.getProducts();
        products.forEach(System.out::println);
        
        //implement all the other operations.
    }
}
