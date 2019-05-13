package com.scenarios.collection.streams.models;

public class ProductWithTax {
	private String description;
	private int price;
	private String type;
	
	private float tax;
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "ProductWithTax [description=" + description + ", price=" + price + ", type=" + type + ", tax=" + tax
				+ "]";
	}
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
	
}
