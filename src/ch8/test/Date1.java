package ch8.test;

import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		int getDate = d.getDate();
		System.out.println(getDate);
		System.out.println(d.getDay());
		//0:일, 1:월, 2:화, 3:수, 4:목, 5:금, 6:토
	}
}
