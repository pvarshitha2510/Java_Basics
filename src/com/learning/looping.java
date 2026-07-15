package com.learning;

public class looping {
	public void getAnswer() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		looping l1 = new looping();
		l1.getAnswer();
	}
}
