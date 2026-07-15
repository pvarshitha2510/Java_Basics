package com.classpractice;

public class Perfect_number {
	public static void perfectNumber(int n) {
		int sum = 0;
		int temp=n;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (temp == sum) {
			System.out.println("Yahoo, It's a Perfect Number");
		} 
		else {
			System.out.println("oh no! It's not a Perfect Number");

		}

	}

	public static void main(String[] args) {
		perfectNumber(6);

	}

}
