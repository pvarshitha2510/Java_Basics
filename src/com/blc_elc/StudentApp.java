package com.blc_elc;

public class StudentApp {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentName("Ravi");
		s1.setJavaMarks(90);
		s1.setSqlMarks(85);
		s1.setWebMarks(95);
		System.out.println(s1.displayDetails());
		System.out.println("Student Report");
		System.out.println("Name : "+s1.getStudentName());
		System.out.println("Total : "+s1.calculateTotal());
		System.out.println("Percentage : "+s1.calculatePercentage()+"%");
	}
}
