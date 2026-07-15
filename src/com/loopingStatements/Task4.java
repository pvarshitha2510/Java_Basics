package com.loopingStatements;

public class Task4 {

	public int factorialNumber() {
		int i = 1;
		int fact = 1;
		while (i <= 5) {
			fact = fact * i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {
		Task4 t4 = new Task4();
		System.out.println("Factorial of a number : " + t4.factorialNumber());
	}

}
