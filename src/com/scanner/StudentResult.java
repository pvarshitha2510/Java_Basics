package com.scanner;

public class StudentResult {
	private String studentName;
	private int studentId;
	private String courseName;
	private double totalMarks;

	public StudentResult(String studentName, int studentId, String courseName, double totalMarks) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.courseName = courseName;
		this.totalMarks = totalMarks;
		System.out.println("Student record Created Successfully..........");
	}

	public void addMarks(double Marks) {
		this.totalMarks += Marks;
		System.out.println("Marks Updated Successfully");
		System.out.println("Updated Marks : " + totalMarks);
		if (Marks <= 0) {
			System.out.println("Invalid marks entered......");
		}
	}

	public void calculateGrade() {
		if(totalMarks<0 || totalMarks>100) {
			System.out.println("Invaild Marks");
		}
		else if (totalMarks <= 100 && totalMarks >= 90) {
			System.out.println("Grade A");
		} else if (totalMarks >= 80 && totalMarks <= 89) {
			System.out.println("Grade B");
		} else if (totalMarks >= 70 && totalMarks <= 79) {
			System.out.println("Grade C");
		} else if (totalMarks >= 60 && totalMarks <= 69) {
			System.out.println("Grade D");
		} else if (totalMarks < 60) {
			System.out.println("Fail");
		} else {
			System.out.println("No marks available to calculate grade......");
		}
		System.out.println("Total Marks : " + totalMarks);
		
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks=totalMarks;
	}
	public double getTotalMarks() {
		return totalMarks;
	}

}
