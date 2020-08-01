package com.live.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.live.model.Product;
import com.live.model.ProductMapper;
@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
JdbcTemplate jdbcTemplate;

private final String SELECT_PRODUCTS = "SELECT * FROM PRODUCTS";
private final String SELECT_PRODUCT_BY_ID = "SELECT * FROM PRODUCTS WHERE product_id = ?";
private final String CREATE_PRODUCT = "INSERT INTO PRODUCTs (PRODUCT_ID, PRODUCT_NAME, PRICE) VALUES (?,?,?)";
private final String UPDATE_PRODUCT = "UPDATE PRODUCTs SET  PRODUCT_NAME=? , PRICE = ? WHERE PRODUCT_ID = ?";
private final String DELETE_PRODUCT = "DELETE FROM PRODUCTs WHERE PRODUCT_ID = ?";
@Autowired
ProductRepositoryImpl(DataSource dataSource){
	jdbcTemplate = new JdbcTemplate(dataSource);
}
@Override
public List<Product> getProducts() {
	ProductMapper productMapper = new ProductMapper();
	List<Product> products = jdbcTemplate.query(SELECT_PRODUCTS,productMapper);
	return products;
}

@Override
public Product getProductById(int productId) {
	ProductMapper productMapper = new ProductMapper();
	Product product = jdbcTemplate.queryForObject(SELECT_PRODUCT_BY_ID,new Object[]{productId}, productMapper );
	return product;
}

	@Override
	public boolean createProduct(Product product) {
		int noOfRowsInserted = jdbcTemplate.update(CREATE_PRODUCT,product.getProductId(),product.getProductName(),product.getPrice());
		return (noOfRowsInserted > 0);
	}

	@Override
	public boolean updateProduct(Product product) {
		int noOfRowsUpdated = jdbcTemplate.update(UPDATE_PRODUCT,product.getProductName(),product.getPrice(),product.getProductId());
		return (noOfRowsUpdated > 0);
	}

	@Override
	public boolean deleteProduct(int productId) {
		jdbcTemplate.update(DELETE_PRODUCT, productId);
		return true;
	}

}
