package com.learning;

public class looping3 {
	public void getData() {
		for (int i = 1; i <= 10; i++) {
			String result = (i % 2 == 0) ? "even" : "odd";
			System.out.println (i + result);
		}
	}

	public static void main(String[] args) {
		looping3 l3 = new looping3();
		l3.getData();

	}

}
