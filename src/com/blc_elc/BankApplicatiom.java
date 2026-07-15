package com.blc_elc;

public class BankApplicatiom {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.setAccountNumber(123456789);
		b1.setAccountHolderName("Varshitha Puvvada");
		b1.setBalance(50000);
		System.out.println("Bank Account Details");
		System.out.println("Account Number : " +b1.getAccountNumber());
		System.out.println("Account Holder Name : "+ b1.getAccountHolderName());
		System.out.println("Balance : "+ b1.getBalance());
		System.out.println("*************************************");
		b1.setBalance(80000);
		System.out.println("Updated Bank Account Details");
		System.out.println("Account Number : " +b1.getAccountNumber());
		System.out.println("Account Holder Name : "+ b1.getAccountHolderName());
		System.out.println("Updated Balance : "+ b1.getBalance());
	}
}
