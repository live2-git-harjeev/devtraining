package com.live.service;

import java.util.List;

import com.live.model.Product;
import com.live.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	
	ProductRepository productRepository;
	
	//constructor based-injection (dependency injection happens here!);
	private ProductServiceImpl(ProductRepository repository) {
		this.productRepository = repository;
	}
	
//	public void mutateMethod() {
//		this.productRepository = null;
//	}
	@Override
	public List<Product> getProducts() {
//		ProductRepository productRepository = new OracleRepository();
//		ProductRepository productRepository = new MySqlRepository();

		return productRepository.getProducts();
	}
}
