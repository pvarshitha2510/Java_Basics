package practice;

public class Electricity_bill {
	static int units = 250;
	static int per_unit = 8;
	static int result = units * per_unit;

	public static void calculateBill() {
		System.out.println("Electricity Bill");
		System.out.println("Units Used : " + units);
		System.out.println("Cost per Unit : " + per_unit);
		System.out.println("Total Bill : " + result);
	}

	public static void main(String[] args) {
		calculateBill();
	}
}
