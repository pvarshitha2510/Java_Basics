package practice;

public class Student {
	int sub=90;
	int result= sub*5;
	int total_marks=500;
	double percentage= (result*100)/total_marks;
	public void calculatePercentage()
	{
		System.out.println(" Student Percentage Report");
		System.out.println(" Total Marks : "+ result);
		System.out.println(" Percentage : "+ percentage +"%");
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.calculatePercentage();
	}
}
