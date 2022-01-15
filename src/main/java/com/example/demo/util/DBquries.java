package com.example.demo.util;

public class DBquries {

	public static final String ADD_NEW_PRODUCT="insert into products values(?,?,?,?,?,?)";
	
	public static final String UPDATE_PRODUCT="update products set product_name=?,product_desc=?,product_price=? where product_id=?";
	
	public static final String FIND_BY_ID="select * from products where product_id=?";
	
	public static final String FETCH_ALL_PRODUCTS="select * from products";
	
	public static final String DELETE_PRODUCT="delete from products where product_id=?";
	
	public static final String FILTER_PRODUCT_BY_BRAND_NAME="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where b.brand_name=?";
	
	public static final String FILTER_BY_PRICE_RANGE="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where p.product_price>=? and p.product_price<=?";
	
	public static final String ADD_NEW_BRAND="insert into brands value(?,?)";
	
	public static final String UPDATE_BRAND="update brands set brand_name=? where brand_id=?";
	
	public static final String FETCH_ALL_BRANDS="select * from brands";
	
	public static final String FIND_BRAND_BY_ID="select * from brands where brand_id=?";
	
	public static final String DELETE_BRAND_BY_ID="delete from brands where brand_id=?";
	
	public static final String ADD_NEW_CATEGORY="insert into categories value(?,?)";
	
	public static final String UPDATE_CATEGORY="update categories set category_name=? where category_id=?";
	
	public static final String FILTER_BY_CATEGORY_ID="select * from categories where category_id=?";
	
	public static final String FETCH_ALL_CATEGORY="select * from categories";
	
	public static final String DELETE_CATEGORY="delete from categories where category_id=?";
}
