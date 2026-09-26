package com.Collections;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12345);
		list.add(13456);
		list.add(14567);
		list.add(15678);
		list.add(16789);
		list.add(17890);
		list.add(19012);
		list.add(10123);
		list.add(3,5001);
		System.out.println(list);
		list.set(5,9001);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(list.size());
		System.out.println(list);
	}
}
