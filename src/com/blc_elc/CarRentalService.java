package com.blc_elc;

public class CarRentalService {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.setCarId(1001);
		c1.setBrand("Toyota");
		c1.setModel("Fortuner");
		c1.setRentalPricePerDay(3000);
		System.out.println("Car Details");
		System.out.println("Car Id : "+ c1.getCarId());
		System.out.println("Car Brand : "+ c1.getBrand());
		System.out.println("Car Model : "+c1.getModel());
		System.out.println("Car Rental Price : "+c1.getRentalPricePerDay());
		Car c2=new Car();
		c2.setCarId(1002);
		c2.setBrand("Hyundai");
		c2.setModel("Creta");
		c2.setRentalPricePerDay(3500);
		System.out.println("*******************************");
		System.out.println("Car Details");
		System.out.println("Car Id : "+ c2.getCarId());
		System.out.println("Car Brand : "+ c2.getBrand());
		System.out.println("Car Model : "+c2.getModel());
		System.out.println("Car Rental Price : "+c2.getRentalPricePerDay());
	}
}
