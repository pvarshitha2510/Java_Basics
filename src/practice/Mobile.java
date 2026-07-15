package practice;

public class Mobile {
	public static String brand="Samsung";
	String model="S24";
	int price=80000;
	public static void brandInfo() {
		System.out.println("Brand : " + brand);
	}
	public void mobileInfo()
	{
		System.out.println("Model : "+ model);
		System.out.println("Price : "+ price);
	}
	public static void main(String[] args) {
		brandInfo();
		Mobile obj=new Mobile();
		obj.mobileInfo();
	}
}