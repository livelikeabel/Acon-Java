package ch4.test;

import java.util.Scanner;

public class While6Input {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("exit : 0");
			System.out.println("integer : ");
			int testInt = scan.nextInt();
			if(testInt == 0) {
				System.exit(0);
			}
			System.out.println(testInt);
		}
	}
}
