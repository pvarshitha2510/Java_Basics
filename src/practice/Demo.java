package practice;

public class Demo{
          static int a=20;
          static int b =30;

          public static void sum(){
                    int result=a+b;
                    System.out.println("sum=" + result);
          }
          public static void average(){
                 sum();
                 double avg=a+b/2.0;
                 System.out.println( "Average="+ avg );
          }
          public static void main (String []args){
                    average();
          }
}
