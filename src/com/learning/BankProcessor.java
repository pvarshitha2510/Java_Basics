package com.learning;

public class BankProcessor {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount( 2510,"Varshitha",10000.0);
		System.out.println("Account Details");
		System.out.println("Account Number : "+ b1.getAccountNumber());
		System.out.println("Account Holder : "+ b1.getAccountHolder());
		System.out.println("Balance : "+b1.getBalance());
		b1.deposit(5000);
		System.out.println("Balance After Deposit");
		System.out.println("Balance: "+ b1.getBalance());
		System.out.println("Deposited Successfully");
		b1.withdraw(1000);
		System.out.println("Balance After Withdrawal");
		System.out.println("Balance: "+ b1.getBalance());
		System.out.println(("Amount withdraw Successfully"));
	}

}
