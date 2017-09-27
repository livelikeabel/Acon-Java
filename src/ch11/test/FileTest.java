package ch11.test;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		File file1 = new File("C://Users/acorn/Desktop");
		System.out.println(file1.isDirectory());
		System.out.println(file1.isFile());
		System.out.println(file1.mkdir());
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		System.out.println(file1.canExecute());
		System.out.println(file1.getPath());
		System.out.println(file1.getName());
		System.out.println(file1.getParentFile());
		System.out.println(file1.getParent());
		System.out.println(file1.list());
		
		String [] sArr = file1.list();
		
		File[] fileArr = file1.listFiles();
		for(int i = 0; i < fileArr.length; i++) {
			System.out.println(fileArr[i]);
			System.out.println(" : ");
			
		}
		
		File file2 = new File("C://Users/acorn/Desktop/aaa.txt");
		file2.delete();
		
	}
}
