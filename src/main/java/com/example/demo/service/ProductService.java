package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Brand;
import com.example.demo.model.Category;
import com.example.demo.model.Product;

public interface ProductService {

	String addNewProduct(Product product);

	String updateProduct(Product product);

	Product getById(int id);

	List<Product> fetchAll();

	List<Product> fetchAllProducts();

	String deleteById(int id);

	List<Product> fetchByBrand(String name);

	List<Product> filterBetweenPriceRange(double minPrice, double maxPrice);

	String addNewBrand(Brand brand);

	String updateBrand(Brand brand);

	List<Brand> fetchAllBrands();

	Brand findById(int id);

	String deleteBrandById(int id);

	String addNewCategory(Category category);

	String updateCategory(Category category);

	Category findByCategoryId(int id);

	List<Category> fetchAllCategory();

	String deleteCategory(int id);
}
