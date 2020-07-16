package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.live.model.Product;

//Indicates that an annotated class is a "component".
//Such classes are considered as candidates for auto-detection 
//when using annotation-based configuration and classpath scanning.

//explicit component name
//@Component(value = "productRepository")
//@Component("productRepository")

//implicit component name (oracleRepository)
@Repository
public class OracleRepository implements ProductRepository {
	 public OracleRepository() {
		 System.out.println("public OracleRepository()");
	}
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
