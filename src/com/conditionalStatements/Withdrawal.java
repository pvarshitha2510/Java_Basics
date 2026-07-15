package com.conditionalStatements;

import java.util.Scanner;

public class Withdrawal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double accountBalance,withdrawalAmount,remainingBalance;
		System.out.print("Enter Account Balance : ");
		accountBalance=sc.nextDouble();
		System.out.print("Enter Withdrawal Amount : ");
		withdrawalAmount = sc.nextDouble();
		if (withdrawalAmount<=accountBalance) {
			System.out.println("Transactional Successful");
		}
		else {
			System.out.println("Insufficient Balance");
		}
		remainingBalance=accountBalance-withdrawalAmount;
		System.out.println("Remaining Balance : " + remainingBalance);
		sc.close();

	}

}
