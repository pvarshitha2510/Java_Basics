package com.scanner;

import java.util.*;

public class EmployeeSalaryCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee  ID : ");
		int emp_Id = sc.nextInt();
        sc.nextLine();
		System.out.println("Enter Employee Name :  ");
		String emp_Name = sc.nextLine();

		System.out.println("Enter Salary : ");
		double emp_Salary = sc.nextDouble();

		System.out.println("Employee Details");
		System.out.println("-----------------");
		System.out.println("Employee ID : " + emp_Id);
		System.out.println("Employee Name : " + emp_Name);
		System.out.println("Basic Salary : " + emp_Salary);

		double Hra = emp_Salary * 0.20;
		double Da = emp_Salary * 0.10;
		double Gross_salary = emp_Salary + Hra + Da;
		System.out.println("HRA(20%) : " + Hra);
		System.out.println("DA(10%) : " + Da);
		System.out.println("Gross Salary : " + Gross_salary);
		sc.close();
	}

}