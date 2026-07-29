package com.scanner;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Student Name : ");
		String studentName = sc.nextLine();
		System.out.println("Enter Student Id  : ");
		int studentId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Course Name : ");
		String courseName = sc.nextLine();
		System.out.println("Enter Total Marks : ");
		double totalMarks = sc.nextDouble();

		StudentResult result = new StudentResult(studentName, studentId, courseName, totalMarks);
		System.out.println("Student Name : " + result.getStudentName());
		System.out.println("Student Id : " + result.getStudentId());
		System.out.println("Course name : " + result.getCourseName());
		System.out.println("Total Marks : " + result.getTotalMarks());
		boolean Menu = true;
		
		while (Menu == true) {
			System.out.println("1.Add More Marks...");
			System.out.println("2.Calculate Grade....");
			System.out.println("3.View Total Marks......");
			System.out.println("4.Exit..");
			System.out.println("Please Enter option : ");

			int option = sc.nextInt();

			switch (option) {

			case 1:
				System.out.print("Enter Marks : ");
				double marks = sc.nextDouble();
				result.setTotalMarks(result.getTotalMarks() + marks);
				System.out.println("Updated Marks : " + result.getTotalMarks());
				break;

			case 2:
				result.calculateGrade();
				break;

			case 3:
				System.out.println("Total Marks : " + result.getTotalMarks());
				break;

			case 4:
				Menu = false;
				System.out.println("Thank You...");
				break;

			default:
				System.out.println("Invalid Option");
			}
		}

		sc.close();
	}

}
