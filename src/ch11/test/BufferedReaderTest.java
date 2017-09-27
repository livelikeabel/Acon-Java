package ch11.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		fr = new FileReader("C://Users/acorn/Desktop/aaa.txt");
		
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		System.out.println(line);
		
		fr.close();
	}
}
