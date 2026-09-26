package com.Collections;
import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Water");
		list.add("Bread");
		list.add("Sprite");
		list.add("KinderJoy");
		list.add("Milk");
		list.add("Handwash");
		list.add("Bag");
		System.out.println(list);
		list.contains("Milk");
		System.out.println(list);
		list.set(2,"Sugar");
		System.out.println(list.set(2, "Brown Sugar"));
		list.set(3, "Soap");
		System.out.println(list.remove(3));
		System.out.println("Updated List : "+ list);
		System.out.println(list.size());	
	}
}
