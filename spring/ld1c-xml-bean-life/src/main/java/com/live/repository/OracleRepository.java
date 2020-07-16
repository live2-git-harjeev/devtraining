package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Product;

public class OracleRepository implements ProductRepository {

	public OracleRepository() {
		System.out.println("OracleRepository()");
	}
	public void init() {
		System.out.println("Bean Initialization Logic......");
	}
	public void destroy() {
		System.out.println("Bean Cleanup Logic......");
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
