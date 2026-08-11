package com.inheritencee;
import java.util.*;
public class InsurancePolicy {
	String customerName;
	String policyType;
	double policyAmount;
	double approvedAmount=0.0;
	String policyStatus="pending";

	public InsurancePolicy(String customerName, String policyType, double policyAmount) {
		this.customerName = customerName;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
		System.out.println("Policy record has been created.");

	}
	public InsurancePolicy(double approvedAmount,String policyStatus) {
		this.approvedAmount=approvedAmount;
		this.policyStatus=policyStatus;
	}
	public void displayData() {
		System.out.println("******* View Summary *********");
		System.out.println("Customer Name : "+customerName);
		System.out.println("Policy Type : "+policyType);
		System.out.println("Policy Amount : "+policyAmount);
		System.out.println("Approved Amount : "+approvedAmount);
		System.out.println("Policy Status : "+policyStatus);
	}
	public double updatedApprovedAmount(double approvedAmount) {
		if(approvedAmount<=0) {
			System.out.println("Invalid Amount");
		}
		else {
			this.approvedAmount=approvedAmount;
			System.out.println("Approved........");
		}
		return approvedAmount;
		
	}
	
	public String changePolicyStatus(String policyStatus) {
		if (policyStatus=="null"||policyStatus=="") {
			System.out.println("Invalid Enter....");
		}
		else {
			this.policyStatus=policyStatus;
			System.out.println("Policy Status changes Successfully");
		}
		return policyStatus;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name : ");
		String customerName=sc.nextLine();
		
		System.out.println("Enter Policy Type : ");
		String policyType=sc.nextLine();
		
		System.out.println("Enter Policy Amount : ");
		double policyAmount=sc.nextDouble();
		
		InsurancePolicy Ip=new InsurancePolicy(customerName,policyType,policyAmount);
		Ip.displayData();
		boolean status = true;
		while (status == true) {
			System.out.println("Update Approved Amount\r\n"
					+ "Change Policy Status\r\n"
					+ "View Policy Summary\r\n"
					+ "Exit the program\r\n"
					+ "");
			System.out.println("Enter option : ");
			int option=sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:
				System.out.println("Enter Amount : ");
				double approvedAmount=sc.nextDouble();	
				Ip.updatedApprovedAmount(approvedAmount);
				break;
			case 2:
				System.out.println("Enter Change Status : ");
				String policyStatus=sc.nextLine();
				Ip.changePolicyStatus(policyStatus);
				break;
			case 3:
				Ip.displayData();
				break;
			case 4:
				System.out.println("Thank You !");
				status=false;
				break;
				default:
					System.out.println("Invalid Option !");
			}
		}sc.close();

	}
	

}
