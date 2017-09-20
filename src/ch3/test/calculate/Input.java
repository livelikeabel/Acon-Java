package ch3.test.calculate;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

	ArrayList input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input mark what you want [ select only these things ( +, -, *, / ) ] ");
		String s = sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		ArrayList al = new ArrayList();
		al.add(s);
		al.add(a);
		al.add(b);
		
		return al;
	}
}
