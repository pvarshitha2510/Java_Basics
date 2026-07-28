package com.user;

	public class Example1 {
		String customerName;
		String customerAddress;
		long phoneNumber;
		double balance;

		public  Example1(String customerName, String customerAddress, long phoneNumber, double balance) {
			this.customerName = customerName;
			this.customerAddress = customerAddress;
			this.phoneNumber = phoneNumber;
			this.balance = balance;
			System.out.println("Account Created Successfully");
		}
		public void deposit(double amount) {
			this.balance+=amount;
			System.out.println("Amount credited successfully  \n"+ balance);
			if(amount<=0) {
				System.out.println("Invalid Amount");
			}
		}
		public void withdraw(double amount) {
			this.balance-=amount;
			if(amount>0) {
			System.out.println("Amount Withdraw Successfully  \n"+balance);
			}
			else if(amount<=0){
				System.out.println("Invalid Withdrawal Amount");
			}
			else {
				System.out.println("Insufficient funds");
			}
		}
		public void showBalance() {
			System.out.println("Your Curent Balance : "+balance);
		}
	}

