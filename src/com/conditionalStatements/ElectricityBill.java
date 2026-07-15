package com.conditionalStatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double billAmount,discount=0,finalBill;
		System.out.print("Enter Bill Amount : ");
		billAmount=sc.nextDouble();
		 if (billAmount>5000) {
			 discount=billAmount*0.20;
		 }
		 else if(billAmount>3000 && billAmount<5000) {
			 discount=billAmount*0.10;
		 }
		 else {
			 discount=0;
		 }
		 finalBill=billAmount-discount;
		 System.out.println("Original Bill : " + billAmount);
		 System.out.println(" Discount : " + discount);
		 System.out.println("Final Bill : "+finalBill);
		 sc.close();
	}
}
