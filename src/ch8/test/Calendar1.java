package ch8.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.getTimeInMillis());
		Calendar c2 = Calendar.getInstance();
		c2.set(1970, 0, 1, 0, 0, 0);
		System.out.println(c2.getTime());
		long i = (c.getTimeInMillis() - c2.getTimeInMillis());
		System.out.println(i); 
	}
}
