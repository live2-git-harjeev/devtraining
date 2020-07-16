package com.live.service;

import java.util.List;

import com.live.model.Product;
import com.live.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	private String domainName;
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String location;
	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
//		set the properties from the properties file configured in spring
		this.domainName = domainName;
	}

	ProductRepository productRepository;

//	SPRING USES THIS CONSTRUCTOR TO INSTANTIATE THE BEAN.
	private ProductServiceImpl() {
		System.out.println("private ProductServiceImpl()");
	}

	// constructor based-injection (dependency injection happens here!);
	private ProductServiceImpl(ProductRepository repository) {
		this.productRepository = repository;
	}

	// public void mutateMethod() {
//		this.productRepository = null;
//	}
	@Override
	public List<Product> getProducts() {
//		ProductRepository productRepository = new OracleRepository();
//		ProductRepository productRepository = new MySqlRepository();

		return productRepository.getProducts();
	}

	public void setProductRepository(ProductRepository productRepository) {
		System.out.println("setProductRepository(ProductRepository productRepository)");
		this.productRepository = productRepository;
	}
}
