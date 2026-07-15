package practice;

public class Student2 {
	int sub1=90;
	int sub2=85;
	int sub3=80;
	int sub4=95;
	int sub5=90;
	int result=sub1+sub2+sub3+sub4+sub5;
	int total_marks=500;
	double percentage=(result*100)/total_marks;
	public void readMarks() {
		System.out.println("******Student Report******");
		System.out.println("Marks:Java : "+sub1);
		System.out.println("SQL : "+sub2);
		System.out.println("HTML : "+sub3);
		System.out.println("CSS : " +sub4);
		System.out.println("JavaScript : "+sub5);
	}
	public void calculatePercentage() {
		System.out.println("Total marks : " + result);
		System.out.println("Percentage : " + percentage+"%");		
	}
	public static void main(String[] args) {
		Student2 obj1 = new Student2();
		obj1.readMarks();
		Student2 obj2 = new Student2();
		obj2.calculatePercentage();
	}

}
