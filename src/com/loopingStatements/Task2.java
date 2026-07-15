package com.loopingStatements;

public class Task2 {
	public void multiplicationTable() {
		int num =5;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + num * i);
		}
	}

	public static void main(String[] args) {
		Task2 t2 = new Task2();
		t2.multiplicationTable();
	}
}
