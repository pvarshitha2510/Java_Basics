package com.blc_elc;

public class Rectangle {
	public double length;
	public double breadth;
	public void setLength(double len) {
		length=len;
	}
	public void setBreadth(double bred) {
		breadth=bred;
	}
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	public double calculateArea() {
		return length*breadth;
	}
	public double calculatePerimeter() {
		return 2*(length+breadth);
	}
	public String displayDetails() {
		return"Enter Length : "+getLength() +"\nEnter Breadth : "+getBreadth();
	}

}


