package com.example.demo.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Brand;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.util.DBquries;
import com.example.demo.util.RowMapperImpl;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String addNewProduct(Product product) {

		int result = jdbcTemplate.update(DBquries.ADD_NEW_PRODUCT, product.getId(), product.getName(),
				product.getDescription(), product.getPrice(), product.getBrand().getId(),
				product.getCategory().getId());
		if (result != 0) {
			return "New Product Added Succesfully";
		}
		return null;
	}

	@Override
	public String updateProduct(Product product) {

		int result = jdbcTemplate.update(DBquries.UPDATE_PRODUCT, product.getName(), product.getDescription(),
				product.getPrice(), product.getId());
		if (result != 0) {
			return "========Update Product Succesfully========";
		}
		return null;

	}

	@Override
	public Product getById(int id) {

		RowMapperImpl mapper = new RowMapperImpl();
		Product product = jdbcTemplate.queryForObject(DBquries.FIND_BY_ID, mapper, id);
		return product;
	}

	@Override
	public List<Product> fetchAll() {
		RowMapperImpl rowMapper = new RowMapperImpl();
		List<Product> product = jdbcTemplate.query(DBquries.FETCH_ALL_PRODUCTS, rowMapper);
		return product;
	}

	@Override
	public List<Product> fetchAllProducts() {
		return jdbcTemplate.query(DBquries.FETCH_ALL_PRODUCTS, (ResultSet rs) -> {
			List<Product> list = new ArrayList<Product>();

			while (rs.next()) {
				Product product = new Product();
				Brand brand = new Brand();
				Category category = new Category();
				product.setId(rs.getInt(1));
				product.setDescription(rs.getString(2));
				product.setName(rs.getString(3));
				product.setPrice(rs.getDouble(4));

				brand.setId(rs.getInt(1));
				brand.setName(rs.getString(2));

				category.setId(rs.getInt(1));
				category.setName(rs.getString(2));

				product.setBrand(brand);
				product.setCategory(category);

				list.add(product);

			}
			return list;
		});

	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		int Result = jdbcTemplate.update(DBquries.DELETE_PRODUCT, id);
		if (Result != 0) {
			return "=========== Delete Product Succesfully ===========";
		}
		return null;
	}

	@Override
	public List<Product> fetchByBrand(String name) {
		return jdbcTemplate.query(DBquries.FILTER_PRODUCT_BY_BRAND_NAME, (ResultSet rs) -> {
			List<Product> list = new ArrayList<Product>();

			while (rs.next()) {
				Product product = new Product();
				Category category = new Category();
				Brand brand = new Brand();
				product.setId(rs.getInt(1));
				product.setDescription(rs.getString(2));
				product.setName(rs.getString(3));
				product.setPrice(rs.getDouble(4));

				category.setId(rs.getInt(1));
				category.setName(rs.getNString(2));

				brand.setId(rs.getInt(1));
				brand.setName(rs.getString(2));

				product.setBrand(brand);
				product.setCategory(category);

				list.add(product);
			}
			return list;

		}, name);

	}

	@Override
	public List<Product> filterBetweenPriceRange(double minPrice, double maxPrice) {
		return jdbcTemplate.query(DBquries.FILTER_BY_PRICE_RANGE,(ResultSet rs)->{
			List<Product> list=new ArrayList<Product>();
			while(rs.next()) {
				Product product=new Product();
				Category category=new Category();
				Brand brand=new Brand();
				
				product.setId(rs.getInt(1));
				product.setDescription(rs.getString(2));
				product.setName(rs.getString(3));
				product.setPrice(rs.getDouble(4));
				
				category.setId(rs.getInt(1));
				category.setName(rs.getString(2));
				
				brand.setId(rs.getInt(1));
				brand.setName(rs.getString(2));
		
		product.setBrand(brand);
		product.setCategory(category);
		
		list.add(product);
	
			}
			return list;	
		},minPrice,maxPrice);
	}

	@Override
	public String addNewBrand(Brand brand) {
		// TODO Auto-generated method stub
		int result= jdbcTemplate.update(DBquries.ADD_NEW_BRAND,brand.getId(),brand.getName());
		if(result!=0) {
			return "======= New Brand Added Succesfully ======";
		}
		return null;
	}

	@Override
	public String updateBrand(Brand brand) {
		// TODO Auto-generated method stub
		 int result=jdbcTemplate.update(DBquries.UPDATE_BRAND,brand.getName(),brand.getId());
		 if(result!=0) {
			 return "===== Product Updated Succesfully =====";
		 }
		 return null;
	}

	@Override
	public List<Brand> fetchAllBrands() {
	
		return jdbcTemplate.query(DBquries.FETCH_ALL_BRANDS,(ResultSet rs)->{
			List<Brand> list=new ArrayList<Brand>();
			while(rs.next()) {
				
				Brand brand=new Brand();
				brand.setId(rs.getInt(1));
				brand.setName(rs.getString(2));
				list.add(brand);
				
			}
			return list;
		});
	}

	@Override
	public Brand findById(int id) {
		
		return jdbcTemplate.query(DBquries.FIND_BRAND_BY_ID,(ResultSet rs)->{
			if(rs.next()) {
			Brand brand=new Brand();
			brand.setId(rs.getInt(1));
			brand.setName(rs.getString(2));
			return brand;
			
			}
			return null;
		},id);
		
	}

	@Override
	public String deleteBrandById(int id) {
		
		 int result=jdbcTemplate.update(DBquries.DELETE_BRAND_BY_ID,id);
		 if(result!=0) {
			 return "======== Delete Brand Succesfully ========";
		 }
		 return null;
	}

	@Override
	public String addNewCategory(Category category) {
		// TODO Auto-generated method stub
		int result=jdbcTemplate.update(DBquries.ADD_NEW_CATEGORY,category.getId(),category.getName());
		if(result!=0) {
			return "======= Add New Category ======";
		}
		return null;
	}

	@Override
	public String updateCategory(Category category) {
		// TODO Auto-generated method stub
		int result= jdbcTemplate.update(DBquries.UPDATE_CATEGORY,category.getName(),category.getId());
		if(result!=0) {
			return "======= Update Category Succesfully ========";
		}
		return null;
	}

	@Override
	public Category findByCategoryId(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(DBquries.FILTER_BY_CATEGORY_ID,(ResultSet rs)->{
			if(rs.next()) {
				Category category=new Category();
				category.setId(rs.getInt(1));
				category.setName(rs.getString(2));
				
				return category;	
			}
			return null;
		},id);
	}

	@Override
	public List<Category> fetchAllCategory() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(DBquries.FETCH_ALL_CATEGORY,(ResultSet rs)->{
			 List<Category> list=new ArrayList<Category>();
			 while(rs.next()) {
				 Category category=new Category();
				 category.setId(rs.getInt(1));
				 category.setName(rs.getString(2));
				 
				 list.add(category);
			 }
			 return list;
		});
	}

	@Override
	public String deleteCategory(int id) {
		// TODO Auto-generated method stub
		int result=jdbcTemplate.update(DBquries.DELETE_CATEGORY,id);
		if(result!=0) {
			return "====== Delete Category Succesfully ======";
		}
		return null;
	}



}
