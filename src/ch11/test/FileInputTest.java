package ch11.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("C://Users/acorn/Desktop/aaa.txt");
		int tmpInt = fis.read();
		while (tmpInt != -1) {
			System.out.print((char) fis.read());
		tmpInt = fis.read();
		}
		fis.close();
	}
}
