package com.live.service;

import java.util.List;

import com.live.model.Product;
import com.live.repository.OracleRepository;
import com.live.repository.ProductRepository;

//@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepository productRepository;
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getProducts() {
		ProductRepository productRepository = new OracleRepository();
//		ProductRepository productRepository = new MySqlRepository();
		return productRepository.getProducts();
	}
}
