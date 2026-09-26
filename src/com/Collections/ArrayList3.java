package com.Collections;
import java.util.ArrayList;
public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Double> list=new ArrayList<>();
		list.add(235.0);
		list.add(30.60);
		list.add(45.30);
		list.add(60.0);
		list.add(90.0);
		list.add(45.70);
		System.out.println(list);
		System.out.println(list.set(1,215.30));
		System.out.println(list.set(5, 45.0));
		list.remove(3);
		System.out.println(list.get(2));
		System.out.println(list.size());
		System.out.println("Updated List : "+list);
		

	}

}
