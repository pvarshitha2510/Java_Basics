package com.user;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name : ");
		String customerName=sc.next();
		System.out.println("Enter Customer Address : ");
		String customerAddress=sc.next();
		System.out.println("Enter Phone Number : ");
		Long phoneNumber=sc.nextLong();
		System.out.println("Enter Balance : ");
		double balance=sc.nextDouble();
		Example1 Bank=new Example1(customerName,customerAddress,phoneNumber,balance);
		System.out.println("******Select an Option Below ******");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Show Balance");
		System.out.println("4.Exit");
		System.out.println("Enter Option: ");
		int option=sc.nextInt();
		if(option==1) {
			System.out.println("Enter Withdraw Amount : ");
			Bank.withdraw(sc.nextDouble());
		}
		else if(option==2) {
			System.out.println("Enter Deposit Amount : ");
			Bank.deposit(sc.nextDouble());
		}
		else if(option==3) {
			Bank.showBalance();
		}
		else if (option==4) {
			System.out.println("ThankYou!");
		}
		else {
			System.out.println("Invalid Option");
		}
			sc.close();
		}
	}

	
