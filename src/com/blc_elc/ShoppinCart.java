package com.blc_elc;

public class ShoppinCart {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductId (100);
		p1.setProductName("Cookies");
		p1.setPrice(25.0);
		p1.setQuantity(1);
		System.out.println("Product1 Id : " + p1.getProductId());
		System.out.println("Product1 Name : " + p1.getProductName());
		System.out.println("Product1 Price : " + p1.getPrice());
		System.out.println("Product1 Quantity : " + p1.getQuantity());
		System.out.println("**************************************");
		Product p2 = new Product();
		p2.setProductId (101);
		p2.setProductName("Chocolates");
		p2.setPrice(100.0);
		p1.setQuantity(5);
		System.out.println("Product2 Id : " + p2.getProductId());
		System.out.println("Product2 Name : " + p2.getProductName());
		System.out.println("Product2 Price : " + p2.getPrice());
		System.out.println("Product2 Quantity : " + p1.getQuantity());
	}

}
