package com.Collections;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		list.add('F');
		System.out.println(list);
		System.out.println(list.set(2, 'Z'));
		System.out.println(list.set(4, 'X'));
		System.out.println(list.size());
		System.out.println(list);
		// list.clear();
		System.out.println(list.isEmpty());
	}
}
