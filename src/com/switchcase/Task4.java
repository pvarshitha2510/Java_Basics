package com.switchcase;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("******** MENU ********");
		System.out.println("1. Pizza");
		System.out.println("2. Burger");
		System.out.println("3. Sandwich");
		System.out.println("4. Coffee");
		System.out.println("5. Exit");

		System.out.print("Enter Your Choice : ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("You Selected : Pizza");
			System.out.println("Price : ₹250");
			break;

		case 2:
			System.out.println("You Selected : Burger");
			System.out.println("Price : ₹150");
			break;

		case 3:
			System.out.println("You Selected : Sandwich");
			System.out.println("Price : ₹120");
			break;

		case 4:
			System.out.println("You Selected : Coffee");
			System.out.println("Price : ₹80");
			break;

		case 5:
			System.out.println("Thank You! Visit Again.");
			break;

		default:
			System.out.println("Invalid Choice");
		}

		sc.close();
	}

}
