package MethodOverride;

public class Person {
	protected void display() {
		System.out.println("I am a person");

	}
	
	

	public static void main(String[] args) {
		Person p = new Student();
		p.display();

	}
}
	class Student extends Person {
		@Override
		public void display() {
			System.out.println("I am a Student");
		}
	}





