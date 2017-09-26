package ch9.test;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList2Test {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		System.out.println(list1.size());
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		list1.add(2, 222);
		System.out.println(list1);
		System.out.println(list1.get(0));
		
		Object o1 = list1.clone();
		System.out.println(o1);
		ArrayList list2 = (ArrayList) o1;
		
		
		Object o2 = list1.clone();
		
	}

}
