package practice;

public class Employee {
	public static String companyName="Infosys";
	int employeeId=1001;
	String employeeName="Ram";
	public static void companyInfo()
	{
		System.out.println("Company Name : "+ companyName);
	}
	public void employeeInfo()
	{
		System.out.println("Employee ID : "+ employeeId);
		System.out.println("Employee Name : "+ employeeName);
		
	}
		public static void main(String[] args) {
			companyInfo();
			Employee obj = new Employee();	
			obj.employeeInfo();
	}

}
