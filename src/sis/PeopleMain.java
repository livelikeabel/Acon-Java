package sis;

import java.util.Scanner;

public class PeopleMain {
	
	public static void main(String[] args) {
		People[] pm = new People[10];
		Scanner scan = new Scanner(System.in);
		int menuInt = 0;
		int rommNo = 0;
		
		while(true) {
			System.out.println("1 : �л��Է�, 2 : �����Է�, 3 : �����Է�");
			menuInt = scan.nextInt();
			if(menuInt == 0) {
				System.exit(0);
			} else if(menuInt == 1) {
//				Student tmpS = new Student();
//				tmpS.
			} else if(menuInt == 2) {
				
			} else if(menuInt == 3) {
				
			}
		}
	}
}
