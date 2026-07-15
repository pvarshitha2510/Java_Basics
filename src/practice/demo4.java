package practice;

public class demo4 {
	static int principal;
	static int  rate ;
	static int  time;
	public static void calculateInterest(int principal,int  rate,int  time) {
		System.out.println((principal * rate * time)/100);
	}
	public static void main(String[] args) {
		calculateInterest(5000,5,2);
	}
}
