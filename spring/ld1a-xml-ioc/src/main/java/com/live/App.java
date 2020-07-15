package com.live;

import com.live.service.ProductService;
import com.live.service.ProductServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enterprise Application starter!" );
        ProductService productService = new ProductServiceImpl();
        productService.getProducts().forEach(System.out::println);
    }
}
