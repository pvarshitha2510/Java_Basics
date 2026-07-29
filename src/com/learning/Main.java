package com.learning;
import java.util.*;



public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name : ");
		String empName=sc.nextLine();
		System.out.println("Enter Employee Id : ");
		int empId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Desgination : ");
		String empDesg=sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		double empSalary=sc.nextDouble();
		Employee1 emp=new Employee1(empName,empId,empSalary,empDesg);
		sc.nextLine();
		System.out.println("Enter Manager Name : ");
		String managerName=sc.nextLine();
		Manager man=new Manager(managerName);
		man.empDetails(emp);
		System.out.println("Updated Salary : "+emp.getEmpSalary());
		sc.close();
	}

}
