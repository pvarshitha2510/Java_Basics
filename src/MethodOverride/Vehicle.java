package MethodOverride;

public class Vehicle {
	public void start() {
		System.out.println("Vehicle Started");
	}
	
	
	public class Car extends Vehicle{
		@Override
		public void start() {
			System.out.println("Car Started");
		}
	}
	

	public static void main(String[] args) {
		Vehicle veh=new Vehicle();
		veh.start();
		Car car=veh.new Car();
		car.start();
	}

}
