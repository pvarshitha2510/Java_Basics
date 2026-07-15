package com.blc_elc;

public class Student {
	public String studentName;
	public int javaMarks;
	public int sqlMarks;
	public int webMarks;

	public void setStudentName(String name) {
		studentName=name;
	}
	public void setJavaMarks(int javaa) {
		javaMarks=javaa;
	}
	public void setSqlMarks(int sqll) {
		sqlMarks=sqll;
	}
	public void setWebMarks(int webb) {
		webMarks=webb;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getJavaMarks() {
		return javaMarks;
	}
	public int getSqlMarks() {
		return sqlMarks;
	}
	public int getWebMarks() {
		return webMarks;
	}
	public int  calculateTotal() {
		return javaMarks+sqlMarks+webMarks;
	}
	public double calculatePercentage() {
		return(calculateTotal()/300.0)*100;
	}
	public String displayDetails() {
		return "Enter Student Name : "+ getStudentName()+"\nEnter Java Marks : " + getJavaMarks()+"\nEnter SQL Marks : "+getSqlMarks()+"\nEnter Web Marks : "+ getWebMarks();
		
	}

}
