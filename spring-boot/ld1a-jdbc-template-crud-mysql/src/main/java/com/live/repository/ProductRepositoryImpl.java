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
private final String SELECT_PRODUCT_BY_ID = "SELECT * FROM PRODUCTS WHERE PRDOCUT_ID = ?";
private final String CREATE_PRODUCT = "INSERT INTO PRODUCT VALUES (PRODUCT_ID, PRODUCT_NAME, PRICE) VALUES (?,?,?)";
private final String UPDATE_PRODUCT = "UPDATE PRODUCT SET  PRODUCT_NAME=? , PRICE = ? WHERE PRODUCT_ID = ?";
private final String DELETE_PRODUCT = "DELETE FROM PRODUCT WHERE PRODUCT_ID = ?";
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
	//jdbcTemplate.queryForObject(.....)
	return null;
}

	@Override
	public boolean createProduct() {
		//jdbcTemplate.upate(......)
		return false;
	}

	@Override
	public boolean updateProduct() {
		//jdbcTemplate.update(..........)
		return false;
	}

	@Override
	public boolean deleteProduct() {
		//jdbcTemplate.delete(...............)
		return false;
	}

}
