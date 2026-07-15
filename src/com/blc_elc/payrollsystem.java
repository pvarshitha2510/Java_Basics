package com.blc_elc;

public class payrollsystem {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmployeeId(101);
		e1.setEmployeeName("Varshitha Puvvada");
		e1.setSalary(100000);
		System.out.println("Employee Details");
		System.out.println("Employee Id : "+ e1.getEmployeeId());
		System.out.println("Employee Name: "+e1.getEmployeeName());
		System.out.println("Employee Salary : "+e1.getSalary());
		e1.setSalary(200000);
		System.out.println("********************************");
		System.out.println("Updated Details");
		System.out.println("Employee Salary : "+ e1.getSalary());
		}
}
