package com.scanner;
import java.util.*;

public class StudentsMarksReport {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Java Marks : ");
		int Java_Marks=sc.nextInt();
		System.out.println("Enter SQL Marks : ");
		int Sql_Marks=sc.nextInt();
		System.out.println("Enter HTML Marks : ");
		int Html_Marks=sc.nextInt();
		System.out.println("Enter CSS Marks : ");
		int Css_Marks=sc.nextInt();
		System.out.println("Enter JavaScript Marks : ");
		int JavaScript_Marks=sc.nextInt();
	
		 
		int Total_Marks=Java_Marks+Sql_Marks+Html_Marks+Css_Marks+JavaScript_Marks;
		double Average=Total_Marks/5.0;
		double Percentage=(Total_Marks/500.0)*100;
		System.out.println("Total Marks : "+Total_Marks);
		System.out.println("Average : "+Average);
		System.out.println("Percentage : "+Percentage + "%");
		sc.close();	
	}

}
