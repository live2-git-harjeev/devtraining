package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Product;

//Indicates that an annotated class is a "component".
//Such classes are considered as candidates for auto-detection 
//when using annotation-based configuration and classpath scanning.

//explicit component name
//@Component(value = "productRepository")
//@Component("productRepository")
//@Component("oracleRepository")

//implicit component name (oracleRepository)
//Indicates that an annotated class is a "Repository", originally defined by Domain-Driven Design (Evans, 2003) 
//as "a mechanism for encapsulating storage,retrieval, and search behavior which emulates a collection of objects". 
//@Repository
public class OracleRepository implements ProductRepository {
	@Override
	public List<Product> getProducts() {
		System.out.println("Oracle Repository");
		List<Product> products = new ArrayList<>();

		Product product = new Product();

		product.setProductId("P01");
		product.setProductName("Oracle");

		products.add(product);

		return products;
	}
}
