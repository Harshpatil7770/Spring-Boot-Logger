package com.example.demo.model;

public class Product {

	private int id;
	
	private String name;
	
	private String description;
	
	private double price;
	
	private Brand brand;
	
	private Category category;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String description, double price, Brand brand, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.brand = brand;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", brand="
				+ brand + ", category=" + category + "]";
	}
	
	
}
