package com.blc_elc;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	public void setEmployeeId(int Id) {
		employeeId=Id;
	}
	public void setEmployeeName(String name) {
		employeeName=name;
	}
	public void setSalary(double sal) {
		salary=sal;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
}
