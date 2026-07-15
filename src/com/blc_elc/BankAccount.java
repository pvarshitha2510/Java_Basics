package com.blc_elc;

public class BankAccount {
	long accountNumber;
	String accountHolderName;
	double balance;
	public void setAccountNumber(long accno)
	{
		accountNumber=accno;
	}
	public void setAccountHolderName(String name) {
		accountHolderName=name;
	}
	public void setBalance(double bal) {
		balance=bal;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
}
