package com.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private  JdbcTemplate jdbcTemplate;
	public void addProduct(Product product) {
		String SQL="insert into product values(?,?,?) ";
		jdbcTemplate.update(SQL,new Object[] {product.getProductId(),product.getProductName(),product.getProductPrice()});
	}
	
}
