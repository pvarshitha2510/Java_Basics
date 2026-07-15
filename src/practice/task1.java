package practice;

public class task1 {
	static String collegeName="ABC college";
	String studentName="Ravi";
	int studentId=101;
	public static void collegeInfo()
	{
		System.out.println("College Name : " + collegeName);
	}
	public void studentInfo()
	{
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		
	}
	public static void main(String[] args) {
		collegeInfo();
		task1 obj=new task1();
		obj.studentInfo();

	}

}
