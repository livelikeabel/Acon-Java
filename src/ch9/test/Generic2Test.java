package ch9.test;

import java.util.ArrayList;

public class Generic2Test {

	public static void main(String[] args) {
		Generic2Test g2t = new Generic2Test();
		
		ArrayList<String> strlist = new ArrayList<String>();
		strlist.add("hi");
		strlist.add("hello");
		g2t.printer(strlist);
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(new Integer(777));
		intlist.add(new Integer(888));
		g2t.printer(intlist);
	}
	
	private void printer(ArrayList<?> list) {
	}
}
