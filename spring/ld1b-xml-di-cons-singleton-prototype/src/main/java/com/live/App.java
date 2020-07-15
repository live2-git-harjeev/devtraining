package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.controller.ProductController;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("SPRING XML CONFIG WITH DI (CONSTRUCTOR BASED)");
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	ProductController productController =  context.getBean("productController", ProductController.class);
    	System.out.println("Controller Scope : " + productController);
    	//Trying to fetch the beans for the second time.
    	productController =  context.getBean("productController", ProductController.class);
    	System.out.println("Controller Scope : " + productController);
    	context.close();
    }
}
