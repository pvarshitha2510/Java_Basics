package com.learning;

public class Manager {
	private String managerName;
	public Manager(String managerName) {
		this.managerName=managerName;
	}
	public String getManagerName(){
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName=managerName;
	}
	
	public void empDetails(Employee1 emp) {
		System.out.println("Employee Name : "+emp.getEmpName());
		System.out.println("Employee Id : "+emp.getEmpId());
		System.out.println("Employee Desg : "+emp.getEmpDesg());
		System.out.println("Employee Salary : "+emp.getEmpSalary());
		
		double salary=emp.getEmpSalary();
		if (salary>=30000 && salary<=40000) {
			emp.setEmpSalary(salary+salary*0.15);
		}else if (salary>40000 && salary<=50000) {
			emp.setEmpSalary(salary+salary*0.10);
		}else {
			System.out.println("Invaid Salary.....");
		}	
	}

}
