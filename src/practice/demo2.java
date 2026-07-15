package practice;

public class demo2 {
	static int rad=5;
	public static void area() {
		double result1=3.14*rad*rad;
		System.out.println("area of a circle = " +result1);
	}
	public static void perimeter() {
		double result2=2*3.14*rad*rad;
		System.out.println("perimeter of a circle = " +result2);
	}
	public static void main(String[] args) {
		area();
		perimeter();
	}
}
