package com.conditionalStatements;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary,bonus,totalSalary;
		System.out.print("Enter Employee Salary : ");
		salary=sc.nextDouble();
		if (salary>50000) {
			bonus = salary*0.15;
		}
		else if (salary>30000 && salary<50000) {
			bonus = salary*0.10;
		}
		else {
			bonus = salary*0.5;
		}
		totalSalary = salary+bonus;
		System.out.println("Salary : "+salary);
		System.out.println("Bonus : "+ bonus);
		System.out.println("Total Salary : "+ totalSalary);
		sc.close();
	}
}