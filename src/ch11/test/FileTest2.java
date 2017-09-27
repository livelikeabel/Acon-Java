package ch11.test;

import java.io.File;
import java.util.ArrayList;

public class FileTest2 {
	ArrayList printArr;
	
	FileTest2() {
		printArr = new ArrayList();
	}
	
	void printList() {
		for(int i = 0; i < printArr.size(); i++) {
			System.out.println(printArr.get(i));
		}
	}
	
	void searchFolder() {
		for(int i = 0; i < printArr.size(); i++) {
			File tmpFile = new File((String) printArr.get(i));
			File[] secondArr = tmpFile.listFiles();
			for (int k = 0; k < secondArr.length; k++) {
				printArr.add(secondArr[k].getPath());
			}
		}
	}
	
	public static void main(String[] args) {
		FileTest2 obj = new FileTest2();
		File targetFolder = new File("C://Users/acon/Desktop");
		File [] firstArr = targetFolder.listFiles();
		for(int i = 0; i < firstArr.length; i++) {
			obj.printArr.add(firstArr[i].getParent());
		}
		
		obj.searchFolder();
		obj.printList();
	}
	
}
