package ch11.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C://Users/acorn/Desktop/aaa.txt");
		FileWriter fw = new FileWriter("C://Users/acorn/Desktop/ddd.txt");
		int tmpInt = fr.read();
		while(tmpInt != -1) {
			fw.write(tmpInt);
			tmpInt = fr.read();
		}
		fw.write("문자열 입력이 free함");
		fw.close();
	}
}
