package ch9.test;

import java.util.ArrayList;

public class Generic1Test {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new String("hi"));
		list.add(new Integer(5));
		String s = (String) list.get(0);
		ArrayList<String> strlist = new ArrayList<String>();
		//�߸��� ������ �Է��� ���� ����
		strlist.add(new String("hi"));
		//strlist.add(new Integer(5)); // errror
		String s2 = strlist.get(0);
	}
}



