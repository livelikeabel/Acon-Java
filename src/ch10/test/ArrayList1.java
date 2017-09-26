package ch10.test;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(new Integer(2));
		list.add(new String("three"));
		list.add(4.4);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.size());
	}
}
