package practice;

public class Employee2 {
	static int basic_salary=30000;
	static int hra=5000;
	static int da=3000;
	static int total=basic_salary+hra+da;
	public static void salaryDetails() {
		System.out.println("*****Employee Salary*****");
		System.out.println("Basic Salary : "+basic_salary);
		System.out.println("HRA : "+hra);
		System.out.println("DA : "+da);
	}
	public static void grossSalary() {
		System.out.println("Gross Salary : "+total);
	}
	public static void main(String[] args) {
		salaryDetails();
		grossSalary();
	}
}
