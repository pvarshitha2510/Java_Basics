package com.Operators;

public class Calculator {

	public static void main(String[] args) {

		double basicSalary = 40000;
		double hra = 8000;
		double da = 4000;

		double grossSalary = basicSalary + hra + da;

		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("HRA          : " + hra);
		System.out.println("DA           : " + da);
		System.out.println("Gross Salary : " + grossSalary);

		System.out.println("Gross Salary > 50000 : " + (grossSalary > 50000));

		grossSalary += 5000;

		System.out.println("Updated Gross Salary : " + grossSalary);
	}
}
