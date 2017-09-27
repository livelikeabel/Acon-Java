package ch11.test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PIAgree implements Serializable{
	String name;
	String tel;
	String addr;
	
}

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C://Users/acorn/Desktop/ggg.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		PIAgree pia = new PIAgree();
		pia.name = "abel";
		pia.tel = "010-5555-7575";
		pia.addr = "서울 성동구";
		oos.writeObject(pia);
		
		FileInputStream fis = new FileInputStream("C://Users/acorn/Desktop/ggg.txt");
		
		DataInputStream dis = new DataInputStream(fis);
		
		oos.close();
		fos.close();
		fis.close();
	}
}
