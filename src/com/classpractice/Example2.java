package com.classpractice;

public class Example2 {
	public  void isUgly(int n) {
		while (n % 2 == 0) {
			n /= 2;
		}
		while (n % 3 == 0) {
			n /= 3;
		}
		while (n % 5 == 0) {
			n /= 5;
		}
		if (n == 1) {
			System.out.println("Hey Varshu, Given number is a Ugly Number");
		} else {
			System.out.println(" Oops! Varshu, Given Number is Not a Ugly Number");
		}

	}

	public static void main(String[] args) {
        Example2 obj=new Example2();
		obj.isUgly(12);
	}

}
