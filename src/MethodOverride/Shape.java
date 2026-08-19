package MethodOverride;

public class Shape {
	public void draw() {
		System.out.println("Drawing shape");
	}
	public static void main(String[] args) {
         Shape s=new circle();
         Shape s1=new Square();
         s.draw();
         s1.draw();     
	}
}
class circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
	class Square extends Shape{
		public void draw() {
			System.out.println("Drawing Square");
		}
	}

