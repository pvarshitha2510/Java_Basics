package com.blc_elc;

public class Book {
	int bookId;
	String title;
	String author;
	double price;
	public void setBookId(int Id) {
		bookId=Id;	
	}
	public void setTitle(String tit) {
		title=tit;
	}
	public void setAuthor(String auth) {
		author=auth;
	}
	public void setPrice(double pric) {
		price=pric;
	}
	public int getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {	
		return price;
	}
}
