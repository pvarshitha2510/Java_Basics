package practice;

public class interest {

    double principal = 10000;
    int rate = 5;
    int time = 2;
    double simpleInterest = (principal * rate * time) / 100;
    public void calculateSI() {
    	 System.out.println("Principal = " + principal);
         System.out.println("Rate = " + rate + "%");
         System.out.println("Time = " + time + " years");
         System.out.println("Simple Interest = " + simpleInterest);
    }
	public static void main(String[] args) {
		interest obj =new interest();
		obj.calculateSI();
	}
}
