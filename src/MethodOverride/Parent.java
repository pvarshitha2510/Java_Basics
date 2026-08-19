package MethodOverride;

public class Parent {
	public static void print() {
		System.out.println("Parent");
	}

	public class Child extends Parent {
		public static void print() {
			System.out.println("Child");
		}

	}

	public static void main(String[] args) {

		Parent.print();
		Child.print();

	}
}
