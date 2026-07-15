package com.blc_elc;

public class Employe {
	public String employeeName;
	public int basicSalary;
	public void setEmployeeName(String Name) {
		employeeName=Name;
	}
	public void setBasicSalary(int sal) {
		basicSalary=sal;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public int calculateHRA() {
		return( basicSalary*20)/100;
	}
	public int calculateDA() {
		return (basicSalary*10)/100;
	}
	public int calculateGrossSalary() {
		return basicSalary+calculateHRA()+calculateDA();
	}
	public String displayEmployeeDetails() {
		return "Enter Employee Name : " + getEmployeeName()+"\nEnter Basic Salary : "+getBasicSalary();
	}
}
