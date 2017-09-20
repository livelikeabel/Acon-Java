package ch3.test;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		
		int inData;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number");
		for (int i = 0; i < 10; i++) {
			inData = sc.nextInt();
			if (inData < 100) {
				if (inData < 50) {
					if (inData <0) {
						System.out.println("minus number");
					}else {
						System.out.println("bigger than 0, small than 50 value");
					}
				}else {
					System.out.println("bigger than 50, small than 100 value");
				}
			}else {
				System.out.println("bigger than 100 value");
			}
		}
		sc.close();
	}
}