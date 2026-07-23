package com.learning;

public class BankAccount {
	public int accountnumber;
	public String accountHolder;
	public Double balance;
	public BankAccount(int accountnumber,String accountHolder,Double balance) {
		this.accountnumber=accountnumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public int getAccountNumber() {
		return accountnumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance=balance;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if (balance>=amount) {
			balance-=amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
}
