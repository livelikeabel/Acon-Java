package ch8.test;

import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		int getDate = d.getDate();
		System.out.println(getDate);
		System.out.println(d.getDay());
		//0:��, 1:��, 2:ȭ, 3:��, 4:��, 5:��, 6:��
	}
}
