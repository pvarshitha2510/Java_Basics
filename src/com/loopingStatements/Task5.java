package com.loopingStatements;

public class Task5 {
	public void even() {
		int i = 1;
		  System.out.print("Even Numbers are : ");
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
			i++;
		}
		  System.out.println();
	}
	public void odd() {
		int i = 1;
		System.out.print("Odd nubers are : ");
		while (i <= 10) {
			if (i % 2 != 0) {
				System.out.print(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Task5 t5 = new Task5();
		t5.even();
		t5.odd();
	}
}
