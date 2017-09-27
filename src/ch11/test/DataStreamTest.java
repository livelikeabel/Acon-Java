package ch11.test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C://Users/acorn/Desktop/fff.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeByte(127);
		dos.writeShort(129);
		dos.writeInt(210000000);
		dos.writeLong(220000000);
		dos.writeFloat(3.3F);
		
		fos.close();
	}
}












