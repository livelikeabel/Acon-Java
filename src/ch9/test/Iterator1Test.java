package ch9.test;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator1Test {
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("hi");
		set.add("hello");
		set.add("how are you");
		set.add("Im fine thankyou");
		set.add("And you?");
		
		Iterator it = set.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
	}//main
}
