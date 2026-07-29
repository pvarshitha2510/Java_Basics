package com.learning;

public class Employee1 {
	private String empName;
	private int empId;
	private double empSalary;
	private String empDesg;
	public Employee1(String empName,int empId,double empSalary,String empDesg) {
		this.empName=empName;
		this.empId=empId;
		this.empSalary=empSalary;
		this.empDesg=empDesg;
		System.out.println("Details Entered Success........");
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg=empDesg;
	}	
	}
	


