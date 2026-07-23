package com.learning;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee E1 = new Employee(123, "Varshu", "Developer", 50000.0, 5);
		System.out.println("Before Promotion:");
		System.out.println("Employee Id:" + E1.getEmpId());
		System.out.println("Employee Name : " + E1.getName());
		System.out.println("Employee Performance Rating : " + E1.getPerformanceRating());
		System.out.println("Employee Designation : " + E1.getDesg());
		System.out.println("Employee Salary : " + "$" + E1.getSalary());
		if (E1.getPerformanceRating() >= 4) {
			E1.promoteEmployee();
			System.out.println("\nAfter Promotion:");
			System.out.println("New Designation : " + E1.getDesg());
			System.out.println("Updated Salary : $" + E1.getSalary());
		} else {
			System.out.println("\nDesignation and salary remain unchanged.");
		}
	}
}
