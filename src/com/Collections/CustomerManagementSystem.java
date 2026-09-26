package com.Collections;

import java.util.*;
import java.util.ArrayList;

public class CustomerManagementSystem {
	int customerId;
	String customerName;
	String City;
	String phoneNumber;

	public CustomerManagementSystem(int customerId, String customerName, String City, String phoneNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.City = City;
		this.phoneNumber = phoneNumber;
		System.out.println("Account Created Successfully");
	}

	public void setCustomerId(int Id) {
		customerId = Id;
	}

	public void setCustomerName(String Name) {
		customerName = Name;
	}

	public void setCity(String city) {
		City = city;
	}

	public void setPhoneNumber(String Number) {
		phoneNumber = Number;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCity() {
		return City;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<CustomerManagementSystem> cust = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("\nEnter Customer " + (i + 1) + " Details");
			System.out.println("Enter Your Id : ");
			int customerId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Your Name : ");
			String customerName = sc.nextLine();
			System.out.println("Enter Your City : ");
			String City = sc.nextLine();

			System.out.println("Enter Your Contact Number :  ");
			String phoneNumber = sc.nextLine();

			CustomerManagementSystem customer = new CustomerManagementSystem(customerId, customerName, City,
					phoneNumber);
			cust.add(customer);
		}
		System.out.println("Customer Details");
		for (int i = 0; i < 1; i++) {

			System.out.println("Enter Your Id : ");
			int customerId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Your Name : ");
			String customerName = sc.nextLine();
			System.out.println("Enter Your City : ");
			String City = sc.nextLine();

			System.out.println("Enter Your Contact Number :  ");
			String phoneNumber = sc.nextLine();

			CustomerManagementSystem newcustomer = new CustomerManagementSystem(customerId, customerName, City,
					phoneNumber);
			cust.add(2, newcustomer);
		}

		System.out.println("Customer Details");
		System.out.println("Enter Your Id : ");
		int customerId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Your Name : ");
		String customerName = sc.nextLine();
		System.out.println("Enter Your City : ");
		String City = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Your Contact Number :  ");
		String phoneNumber = sc.nextLine();
		CustomerManagementSystem replacecustomer = new CustomerManagementSystem(customerId, customerName, City,
				phoneNumber);
		cust.set(3, replacecustomer);

		cust.remove(1);

		System.out.println("Customer Details");
		for (int i = 0; i < cust.size(); i++) {
			CustomerManagementSystem c = cust.get(i);
			System.out.println("\n Customer " + (i + 1));
			System.out.println("Customer Id : " + c.getCustomerId());
			System.out.println("Customer Name : " + c.getCustomerName());
			System.out.println("City : " + c.getCity());
			System.out.println("Contact Number : " + c.getPhoneNumber());
		}
		System.out.println("\nTotal Customers : " + cust.size());

		// cust.clear();
		// System.out.println("Is Customer list is Empty?" +cust.isEmpty());
		sc.close();

	}
}
