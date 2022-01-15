package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Brand;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import com.example.demo.util.LoggerImpl;

@RestController
@RequestMapping("/api/ecart")
public class EcartController {

	private  Logger logger=LoggerImpl.getLogger(EcartController.class);
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/add/product")
	public String addNewProduct(@RequestBody Product product) {
		String methodName=" addNewProduct()";
		logger.info(methodName+" called()");
		return productService.addNewProduct(product);
	}
	
	@PutMapping("/update")
	public String updateProduct(@RequestBody Product product) {
		String methodName=" updateProduct()";
		logger.info(methodName+" called()");
		return productService.updateProduct(product);
	}
	
	@GetMapping("/filter/{id}")
	public Product getById(@PathVariable int id) {
		String methodName=" getById()";
		logger.info(methodName+" called()");
		return productService.getById(id);
	}
	
	@GetMapping("/fetchAll")
	public List<Product> fetchAll() {
		String methodName=" fetchAll()";
		logger.info(methodName+" called()");
		return productService.fetchAll();
	}
	
	@GetMapping("/fetchAll/products")
	public List<Product> fetchAllProducts() {
		String methodName=" fetchAllProducts()";
		logger.info(methodName+" called()");
		return productService.fetchAllProducts();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		String methodName=" deleteById()";
		logger.info(methodName+" called()");
		 productService.deleteById(id);
	}
	
	@GetMapping("/filter/product/{name}")
	public List<Product> fetchByBrand(@PathVariable String name) {
		String methodName=" fetchByBrand()";
		logger.info(methodName+" called()");
		return productService.fetchByBrand(name);
	}
	
	@GetMapping("/filter/product/{minPrice}/{maxPrice}")
	public List<Product> filterBetweenPriceRange(@PathVariable double minPrice,@PathVariable double maxPrice) {
		String methodName=" filterBetweenPriceRange()";
		logger.info(methodName+" called()");
		return productService.filterBetweenPriceRange(minPrice, maxPrice);
	}
	
	@PostMapping("/add/new/brand")
	public String addNewBrand(@RequestBody Brand brand) {
		String methodName=" addNewBrand()";
		logger.info(methodName+" called()");
		return productService.addNewBrand(brand);
	}
	
	@PutMapping("/update/brand")
	public String updateBrand(@RequestBody Brand brand) {
		String methodName=" updateBrand()";
		logger.info(methodName+" called()");
		return productService.updateBrand(brand);
	}
	@GetMapping("/fetchall/brands")
	public List<Brand> fetchAllBrands() {
		String methodName=" fetchAllBrands()";
		logger.info(methodName+" called()");
		return productService.fetchAllBrands();
	}
	
	@GetMapping("/filter/brand/{id}")
	public Brand findById(@PathVariable int id) {
		String methodName=" findById()";
		logger.info(methodName+" called()");
		return productService.findById(id);
	}
	
	@DeleteMapping("/delete/brand/{id}")
	public String deleteBrandById(@PathVariable int id) {
		String methodName=" deleteBrandById()";
		logger.info(methodName+" called()");
		return productService.deleteBrandById(id);
	}
	

	@PostMapping("/add/newcategory")
	String addNewCategory(@RequestBody Category category) {
		String methodName=" addNewCategory()";
		logger.info(methodName+" called()");
		return productService.addNewCategory(category);
	}
	 
	@PutMapping("/update/category")
	 String updateCategory(@RequestBody Category category) {
		String methodName=" updateCategory()";
		logger.info(methodName+" called()");
		 return productService.updateCategory(category);
	 }
	 
	@GetMapping("/filter/category/{id}")
	 Category findByCategoryId(@PathVariable int id) {
		String methodName=" findByCategoryId()";
		logger.info(methodName+" called()");
		 return productService.findByCategoryId(id);
	 }
	 
	@GetMapping("/fetchall/category")
	 List<Category> fetchAllCategory(){
		String methodName=" fetchAllCategory()";
		logger.info(methodName+" called()");
		 return productService.fetchAllCategory();
	 }
	 
	@DeleteMapping("/delete/category/{id}")
	 String deleteCategory(@PathVariable int id) {
		String methodName=" deleteCategory()";
		logger.info(methodName+" called()");
		 return productService.deleteCategory(id);
	 }
	
}
