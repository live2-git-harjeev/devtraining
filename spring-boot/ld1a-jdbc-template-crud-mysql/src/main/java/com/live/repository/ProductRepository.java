package com.live.repository;

import java.util.List;

import com.live.model.Product;

public interface ProductRepository {
public boolean createProduct();
public boolean updateProduct();
public boolean deleteProduct();
public List<Product> getProducts();
public Product getProductById();
}
