package ch11.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		fos = new FileOutputStream("C://Users/acorn/Desktop/ccc.txt");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		while(!str.equals("close")) {
			for(int i=0; i < str.length(); i++) {
				fos.write(str.charAt(i));
			}			
			fos.write(13);
			str = sc.next();
		}
		fos.write(104);
		fos.close();
		
	}
}
