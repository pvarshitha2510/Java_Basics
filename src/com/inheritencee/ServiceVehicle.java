package com.inheritencee;

import java.util.*;

public class ServiceVehicle extends Vehicle {
	String serviceCentreName;
	String serviceCategory;

	public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType, String serviceCentreName,
			String serviceCategory) {
		super(ownerName, vehicleNumber, vehicleType);
		this.serviceCentreName = serviceCentreName;
		this.serviceCategory = serviceCategory;
		System.out.println("Vehicle profile has been created.");
	}

	public String updatedcategory(String serviceCategory) {
		if (serviceCategory == "null") {
			System.out.println("Invalid Details");
		} else {

			this.serviceCategory = serviceCategory;
			System.out.println("Successfully Updated");
		}
		return serviceCategory;

	}

	public String updatedServiceCenterName(String serviceCentreName) {
		if (serviceCentreName == "null") {
			System.out.println("Invalid Details");
		} else {

			this.serviceCentreName = serviceCentreName;
			System.out.println("Succesfully Updated");
		}
		return serviceCentreName;
	}

	public void displayData() {
		System.out.println("*********** View Profile **************");
		System.out.println("OwnerName : " + ownerName);
		System.out.println("VehicleNumber : " + vehicleNumber);
		System.out.println("VehicleType : " + vehicleType);
		System.out.println("Service Centre Name : " + serviceCentreName);
		System.out.println("Service Category : " + serviceCategory);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Owner name : ");
		String ownerName = sc.nextLine();
		System.out.println("Enter Vehicle Numer : ");
		String vehicleNumber = sc.nextLine();
		System.out.println("Enter Vehicle Type : ");
		String vehicleType = sc.nextLine();
		System.out.println("Enter Service center Name : ");
		String serviceCentreName = sc.nextLine();
		System.out.println("Enter Service Category : ");
		String serviceCategory = sc.nextLine();

		ServiceVehicle sv = new ServiceVehicle(ownerName, vehicleNumber, vehicleType, serviceCentreName,
				serviceCategory);
		sv.displayData();
		
		boolean status = true;
		while (status == true) {
			
			System.out.println("Update Service Category\r\n" + "Update Service Center Name\r\n"
					+ "View Vehicle Profile Details\r\n" + "Exit the program\r\n" + "\r\n" + "");
			System.out.println("Enter Option : ");
			int option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				System.out.println("Enter New Category Name : ");
				String NewCategory = sc.nextLine();
				sv.updatedcategory(NewCategory);
				break;
			case 2:
				System.out.println("Enter New Center Name : ");
				String NewCenter = sc.nextLine();
				sv.updatedServiceCenterName(NewCenter);
			case 3:
				sv.displayData();
				break;
			case 4:
				System.out.println("ThankYou ! ");
				status = false;
				break;
			default:
				System.out.println("Invaild Choice ! Please Try Again....."); 
			}
		}
		sc.close();
	}
}
