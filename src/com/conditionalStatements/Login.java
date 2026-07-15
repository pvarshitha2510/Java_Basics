package com.conditionalStatements;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username;
		int password;
		System.out.print("Enter Username : ");
		username=sc.nextLine();
		System.out.print("Enter Password : ");
		password=sc.nextInt();
		if(username.equals("admin") && password==1234) {
			System.out.print("Login Successful");
		}
		else {
			System.out.println("Invalid Username or Password");
		}
		sc.close();
	}
}
