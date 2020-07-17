package com.live.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.live.model.Product;
import com.live.repository.OracleRepository;
import com.live.repository.ProductRepository;

//@Service
public class ProductServiceImpl implements ProductService{
	@Value("${domain.name}")
	private String domain;
	
	public String getDomain() {
		return domain;
	}

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
