package practice;

public class demo3 {
	static int sub1=85;
	static int sub2=90;
	static int sub3=80;
	public static void totalMarks(int sub1,int sub2,int sub3) {
		System.out.println("Total marks = " +sub1+sub2+sub3 );
	}
	public static void averageMarks(int sub1,int sub2,int sub3) {
		System.out.println("Average marks = " + (sub1+sub2+sub3/2.0));
	}
	public static void main(String[] args) {
		totalMarks(85,90,80);
		averageMarks(85,90,80);
	}
}
