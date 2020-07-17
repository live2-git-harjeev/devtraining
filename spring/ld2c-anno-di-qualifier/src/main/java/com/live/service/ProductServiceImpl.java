package com.live.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.live.model.Product;
import com.live.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {
//	Marks a constructor, field, setter method or config method
//	as to be autowiredby Spring's dependency injection facilities. 

// The autowiring happens by type.
// Field based injection
//	@Autowired
//	@Qualifier("mySqlRepository")
	private ProductRepository productRepository;
//	@Qualifier("oracleRepository")
	private ProductRepository productRepository2;

	public ProductServiceImpl() {
		System.out.println("inside ProductServiceImpl() > " + productRepository);
	}

//@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		System.out.println("inside ProductServiceImpl() > " + productRepository);
	}

//	@Autowired
	public void setProductRepository(@Qualifier("mySqlRepository") ProductRepository productRepository,
			@Qualifier("oracleRepository") ProductRepository productRepository2) {
		System.out.println("setProductRepository(ProductRepository productRepository)" + productRepository);
		this.productRepository = productRepository;
		this.productRepository2 = productRepository2;
	}

//		@Autowired
//		@Qualifier("mySqlRepository")
	public void setFunnyProductRepository(ProductRepository productRepository) {
		System.out.println("setFunnyProductRepository(ProductRepository productRepository)" + productRepository);
		this.productRepository = productRepository;
	}

	// @Autowired
	public void funniestMethod(ProductRepository productRepository) {
		System.out.println("funniestMethod(ProductRepository productRepository)" + productRepository);
		this.productRepository = productRepository;
	}
//	static {
//		System.out.println("Static block here ");
//	}	
//	{
//		System.out.println("Generic block here");
//	}

	@Override
	public List<Product> getProducts1() {
//		ProductRepository productRepository = new OracleRepository();
//		ProductRepository productRepository = new MySqlRepository();
		return productRepository.getProducts();
	}

	@Override
	public List<Product> getProducts2() {
//		ProductRepository productRepository = new OracleRepository();
//		ProductRepository productRepository = new MySqlRepository();
		return productRepository2.getProducts();
	}
}
