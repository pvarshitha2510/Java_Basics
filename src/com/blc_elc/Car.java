package com.blc_elc;

public class Car {
	int carId;
	String brand;
	String model;
	double rentalPricePerDay;
	public void setCarId(int Id) {
		carId=Id;
	}
	public void setBrand(String Brand) {
		brand=Brand;
	}
	public void setModel(String Model) {
		model=Model;
	}
	public void setRentalPricePerDay(double rent) {
		rentalPricePerDay=rent;
	}
	public int getCarId() {
		return carId;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double  getRentalPricePerDay() {
		return rentalPricePerDay;
	}
}

