package com.Operators;

public class Assignment_Operator {

	public static void main(String[] args) {
		int num = 100;

		System.out.println("Initial Value : " + num);

		num += 20;
		System.out.println("After += 20 : " + num);

		num -= 10;
		System.out.println("After -= 10 : " + num);

		num *= 2;
		System.out.println("After *= 2 : " + num);

		num /= 5;
		System.out.println("After /= 5 : " + num);

		num %= 6;
		System.out.println("After %= 6 : " + num);
	}
}
