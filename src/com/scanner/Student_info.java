package com.scanner;
import java.util.*;

public class Student_info {
	int st_id;
	String st_name;
	int st_age;
	String st_course;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student  ID : ");
		int st_id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name :  ");
		String st_name = sc.nextLine();
		System.out.println("Enter Age : ");
		int st_age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Course : ");
		String st_course = sc.nextLine();
		
		System.out.println("Student Details");
		System.out.println("----------------");
		System.out.println("Student ID : " + st_id);
		System.out.println("Student Name : " + st_name);
		System.out.println("Age : " + st_age);
		System.out.println("Course : " + st_course);

		sc.close();
	}

}
