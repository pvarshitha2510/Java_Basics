package com.blc_elc;

public class RectangleApp {

		public static void main(String[] args) {
			Rectangle rect=new Rectangle();
			rect.setLength(10);
			rect.setBreadth(5);
			System.out.println(rect.displayDetails());
			System.out.println("Rectangle Details");
			System.out.println("Length : "+rect. getLength());
			System.out.println("Breadth : "+rect. getBreadth());
			System.out.println("Area : "+rect. calculateArea());
			System.out.println("Breadth : "+rect.calculatePerimeter());
			

		}

	}



