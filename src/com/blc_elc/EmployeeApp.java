package com.blc_elc;

public class EmployeeApp {

	public static void main(String[] args) {
		Employe e1=new Employe();
		e1.setEmployeeName("Rahul");
		e1.setBasicSalary(30000);
		System.out.println(e1.displayEmployeeDetails());
		System.out.println("Employee Salary Report");
		System.out.println("Employee Name : "+ e1.getEmployeeName());
		System.out.println("Basic Salary : "+ e1.getBasicSalary());
		System.out.println("HRA : "+e1.calculateHRA());
		System.out.println("DA : "+e1.calculateDA());
		System.out.println("Gross Salary : " + e1.calculateGrossSalary());
	}

}
