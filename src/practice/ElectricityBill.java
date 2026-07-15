package practice;

public class ElectricityBill {
	static int units = 250;
	static int cost = 8;
	static int total = units * cost;

	public void unitDetails() {
		System.out.println("*****Electricity Bill*****");
		System.out.println("Units Consumed : " + units);
		System.out.println("Cost per Unit : " + cost);
	}

	public static void calculateBill() {
		System.out.println("Total Bill : " + total);
	}

	public static void main(String[] args) {
		ElectricityBill obj = new ElectricityBill();
		obj.unitDetails();
		calculateBill();
	}
}
