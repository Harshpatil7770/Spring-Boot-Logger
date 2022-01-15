package com.example.demo.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Product;

public class RowMapperImpl implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
	Product product=new Product();
	product.setId(rs.getInt(1));
	product.setName(rs.getString(2));
	product.setDescription(rs.getString(3));
	
	return product;
	}

}
