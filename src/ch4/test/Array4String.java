package ch4.test;

import java.util.Scanner;

public class Array4String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String[] as = new String[s.length()];
		as = s.split("");

		for (String st : as)
			System.out.println(st);
		
		sc.close();
	}
}
