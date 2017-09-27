package ch11.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		fr = new FileReader("C://Users/acorn/Desktop/aaa.txt");
		int tmpInt = fr.read();
		while(tmpInt != -1)	{
			System.out.println((char) tmpInt);
			tmpInt = fr.read();
		}
		fr.close();
	}
}
