package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Brand;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.util.LoggerImpl;
@Service
public class ProductServiceImpl implements ProductService {

	private Logger logger=LoggerImpl.getLogger(ProductServiceImpl.class);
	
	@Autowired
	ProductDao productDao;
	
	@Override
	public String addNewProduct(Product product) {
	String methodName=" addNewProduct()";
	logger.info(methodName+" Called()");
		return productDao.addNewProduct(product);
	}

	@Override
	public String updateProduct(Product product) {
		String methodName=" updateProduct()";
		logger.info(methodName+" Called()");
		return productDao.updateProduct(product);
	}

	@Override
	public Product getById(int id) {
		String methodName=" getById()";
		logger.info(methodName+" Called()");
		return productDao.getById(id);
	}

	@Override
	public List<Product> fetchAll() {
		String methodName=" fetchAll()";
		logger.info(methodName+" Called()");
		return productDao.fetchAll();
	}

	@Override
	public String deleteById(int id) {
		String methodName=" deleteById()";
		logger.info(methodName+" Called()");
		return productDao.deleteById(id);
	}

	@Override
	public List<Product> fetchByBrand(String name) {
		String methodName=" fetchByBrand()";
		logger.info(methodName+" Called()");
		return productDao.fetchByBrand(name);
	}

	@Override
	public List<Product> fetchAllProducts() {
		String methodName=" fetchAllProducts()";
		logger.info(methodName+" Called()");
		return productDao.fetchAllProducts();
	}

	@Override
	public List<Product> filterBetweenPriceRange(double minPrice, double maxPrice) {
		String methodName=" filterBetweenPriceRange()";
		logger.info(methodName+" Called()");
		return productDao.filterBetweenPriceRange(minPrice, maxPrice);
	}

	@Override
	public String addNewBrand(Brand brand) {
		String methodName=" addNewBrand()";
		logger.info(methodName+" Called()");
		return productDao.addNewBrand(brand);
	}

	@Override
	public String updateBrand(Brand brand) {
		String methodName=" updateBrand()";
		logger.info(methodName+" Called()");
		return productDao.updateBrand(brand);
	}

	@Override
	public List<Brand> fetchAllBrands() {
		String methodName=" fetchAllBrands()";
		logger.info(methodName+" Called()");
		return productDao.fetchAllBrands();
	}

	@Override
	public Brand findById(int id) {
		String methodName=" findById()";
		logger.info(methodName+" Called()");
		return productDao.findById(id);
	}

	@Override
	public String deleteBrandById(int id) {
		String methodName=" deleteBrandById()";
		logger.info(methodName+" Called()");
		return productDao.deleteBrandById(id);
	}

	@Override
	public String addNewCategory(Category category) {
		String methodName=" fetchAll()";
		logger.info(methodName+" Called()");
		return productDao.addNewCategory(category);
	}

	@Override
	public String updateCategory(Category category) {
		String methodName=" fetchAll()";
		logger.info(methodName+" Called()");
		return productDao.updateCategory(category);
	}

	@Override
	public Category findByCategoryId(int id) {
		String methodName=" fetchAll()";
		logger.info(methodName+" Called()");
		return productDao.findByCategoryId(id);
	}

	@Override
	public List<Category> fetchAllCategory() {
		String methodName=" fetchAll()";
		logger.info(methodName+" Called()");
		return productDao.fetchAllCategory();
	}

	@Override
	public String deleteCategory(int id) {
		String methodName=" deleteCategory()";
		logger.info(methodName+" Called()");
		return productDao.deleteCategory(id);
	}


}
