package com.live.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.live.model.Product;
import com.live.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {
//	Marks a constructor, field, setter method or config method
//	as to be autowiredby Spring's dependency injection facilities. 

// The autowiring happens by type.
// Field based injection
	@Autowired
	private ProductRepository productRepository;

	public ProductServiceImpl() {
		System.out.println("inside ProductServiceImpl() > " + productRepository);
	}

	@Autowired
	 public void setProductRepository(ProductRepository productRepository) {
		System.out.println("setProductRepository(ProductRepository productRepository)");
		this.productRepository = productRepository;
	}
//	static {
//		System.out.println("Static block here ");
//	}	
//	{
//		System.out.println("Generic block here");
//	}

	@Override
	public List<Product> getProducts() {
//		ProductRepository productRepository = new OracleRepository();
//		ProductRepository productRepository = new MySqlRepository();
		return productRepository.getProducts();
	}
}
