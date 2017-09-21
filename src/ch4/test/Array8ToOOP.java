package ch4.test;

import java.util.Scanner;

public class Array8ToOOP {
	
	void exitUserNumber(int userNumber) {
		if(userNumber == 0) System.exit(0);
	}
	
	void printChosemenu() {
		System.out.println("----------------------"
				   + "\n#Chose your menu"+"\n\n"
				   +"menu :  0 - close \n        "
				   + "1 - input \n        "
				   + "2 - output"
				   +"\n----------------------");		
	}
	
	
	public static void main(String[] args) {
		String[] nameArr = new String[10];
		String[] telArr = new String[10];
		String[] agreeArr = new String[10];
		Array8ToOOP ap = new Array8ToOOP();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			ap.printChosemenu();
			int userNumber = sc.nextInt();
			ap.exitUserNumber(userNumber);
			if(userNumber == 1) {
				System.out.println("#Input your inpormation");
				System.out.print("name : ");
				nameArr[i] = sc.next();
				System.out.print("tel : ");
				telArr[i] = sc.next();
				System.out.print("y/n :");
				agreeArr[i] = sc.next();
			}
			if(userNumber == 2) {
				System.out.println("#output : ");
				for(int j = 0; j < i; j++) {
					System.out.println(
								"name : " + nameArr[j] +"\n"
							  + " tel : " + telArr[j] +"\n"
						      + " y/n : " + agreeArr[j]
							);
				}
			}
			i++;
		}
		
	}
	
}
