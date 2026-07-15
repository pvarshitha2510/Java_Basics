package com.blc_elc;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	public void setProductId(int Id) {
		productId=Id;
	}
	public void setProductName(String name) {
		productName=name;
	}
	public void setPrice(double pric) {
		price=pric;
	}
	public void setQuantity(int quan) {
		quantity=quan;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
}
