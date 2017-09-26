package ch10.test;

import java.util.HashSet;

public class Set1Test {
	public static void main(String[] args) {
		HashSet set = new HashSet();//약점이 있다. 순서가 없고, 중복데이터가 저장되지 않는다.
		set.add(1);
		set.add(new Integer(2));
		set.add(new String("three"));
		set.add(4.4);
		set.add(1);
		System.out.println(set);
		System.out.println(set.size());
		
	}
}
