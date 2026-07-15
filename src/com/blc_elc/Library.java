package com.blc_elc;

public class Library {

	public static void main(String[] args) {
		Book b=new Book();
		b.setBookId(101);
		b.setTitle("The Alchemist");
		b.setAuthor("Paulo Coelho");
		b.setPrice(120);
		
		System.out.println("Book1 Details");
		System.out.println("Book Id : "+ b.getBookId());
		System.out.println("Book Title : "+ b.getTitle());
		System.out.println("Book Author : "+ b.getAuthor());
		System.out.println("Book Price : "+ b.getPrice());
		Book b1=new Book();
		b1.setBookId(102);
		b1.setTitle("Rich Dad Poor Dad");
		b1.setAuthor("Robert T Kiyosak");
		b1.setPrice(225);
		System.out.println("******************************");
		System.out.println("Book2 Details");
		System.out.println("Book Id : "+ b1.getBookId());
		System.out.println("Book Title : "+ b1.getTitle());
		System.out.println("Book Author : "+ b1.getAuthor());
		System.out.println("Book Price : "+ b1.getPrice());
	}
}
