package com.learning;

public class Employee {
	public int EmpId;
	public String Name;
	public String Desg;
	public Double salary;
	public int performanceRating;

	public Employee(int EmpId, String Name, String Desg, Double salary, int performanceRating) {
		this.EmpId = EmpId;
		this.Name = Name;
		this.Desg = Desg;
		this.salary = salary;
		this.performanceRating = performanceRating;
	}

	public int getEmpId() {
		return EmpId;
	}

	public String getName() {
		return Name;
	}

	public String getDesg() {
		return Desg;
	}

	public Double getSalary() {
		return salary;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public void setDesignation(String Desg) {
		this.Desg = Desg;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void promoteEmployee() {
		if ((performanceRating >= 4)) {
			salary += (salary * 20 / 100);
		}
	}

}
