package MethodOverride;

public class Animal {
	public void makeSound() {
		System.out.println("Animal Sound");
	}
	
	public class Dog extends Animal{
		public void makeSound() {
			System.out.println("Bark");
		}
	}

	public static void main(String[] args) {
		Animal ani=new Animal();
		ani.makeSound();
		Dog dog=ani.new Dog();
		dog.makeSound();
	}

}
