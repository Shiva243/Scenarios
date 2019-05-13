package com.scenarios.collection.streams.models;

public class Product {
	
	private String description;
	private int price;
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(String description, int price, String type) {
		super();
		this.description = description;
		this.price = price;
		this.type=type;
	}
	@Override
	public String toString() {
		return "Product [description=" + description + ", price=" + price + ", type=" + type + "]";
	}
	
	

}
