package ch8.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat1 {
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
		String s1 = sdf.format(d);
		System.out.println(s1);
		
		SimpleDateFormat sdf2 
			= new SimpleDateFormat("YYYY³â MM¿ù ddÀÏ HH:mm:ss");
		String s2 = sdf2.format(d);
		System.out.println(s2);
	}
}
