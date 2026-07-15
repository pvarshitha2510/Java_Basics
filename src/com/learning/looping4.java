package com.learning;

public class looping4 {
	public void getData() {
		int num = 5;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "X" + i + "=" + num * i);
		}
	}

	public static void main(String[] args) {
		looping4 l4 = new looping4();
		l4.getData();
	}
}
