package com.classpractice;

public class Example1 {
	public void isSum(int num) {
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int a = num % 10;
			sum = sum + a;
			num /= 10;
		}
		if (temp % sum == 0) {
			System.out.println("Is a Harshad Number");
		} else {
			System.out.println("Not a Harshad Number");
		}
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.isSum(20);
	}
}
