package ch11.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class OutputStreamWriterTest {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		fos = new FileOutputStream("C://Users/acorn/Desktop/ddd.txt");
		//node �����, filter ����.
		OutputStreamWriter osw = null;
		osw = new OutputStreamWriter(fos);
		//////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		osw.write("hello guys");
		while(!str.equals("close"))
		osw.write(str);
		//node ���� filter�� ���� close �Ѵ�.
		sc.close();
		osw.close();
		fos.close();
	}
}













