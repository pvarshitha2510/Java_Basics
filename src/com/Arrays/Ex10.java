package com.Arrays;
import java.util.*;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Short[] arr=new Short[4];
		System.out.println("Enter Value : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextShort();
		}
		for(Short i:arr) {
			System.out.println(i);
		}
		sc.close();
	}

}
