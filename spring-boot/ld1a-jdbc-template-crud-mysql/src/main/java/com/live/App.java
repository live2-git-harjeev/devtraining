package com.live;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.live.config.AppConfig;
import com.live.model.Product;
import com.live.repository.ProductRepository;

public class App {
	public static void main(String[] args) {
		System.out.println("SPRING JDBC TEMPLATE");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
		// Insert Product
		// productRepository.createProduct(new Product(105,"Spring JDBC", 50.6f));

		// Get Products
		List<Product> products = productRepository.getProducts();
		products.forEach(System.out::println);

		// Get a product
		Product product = productRepository.getProductById(100);
		System.out.println("Got the product : " + product);
		// Update Product
		productRepository.updateProduct(new Product(105, "Spring JDBC", 70.70f));
		products = productRepository.getProducts();
		products.forEach(System.out::println);

		// Delete Product
		boolean status = productRepository.deleteProduct(105);
		if (status == true) {
			System.out.println("Product Deleted ");
		}
		products = productRepository.getProducts();
		products.forEach(System.out::println);

	}
}
