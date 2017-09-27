package ch11.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("C://Users/acorn/Desktop");
		InputStreamReader isr = new InputStreamReader(fis);
		int tmpInt = fis.read();
		while(tmpInt != -1) {
			System.out.println((char) tmpInt);
			tmpInt = fis.read();
		}
		fis.close();
	}
}