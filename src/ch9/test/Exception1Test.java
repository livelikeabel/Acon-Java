package ch9.test;

import java.util.ArrayList;

public class Exception1Test {
	
	public static void main(String[] args) {
		//System.out.println(3/0); ArithmeticException
		String str = null;
		//System.out.println(str.length()); //NullPointerException
		String str2 = new String("hello");
		//System.out.println(str2.charAt(5)); //StringIndexOutOfBoundsException
		ArrayList list = new ArrayList();
		list.add(str2);
//		Exception1Test e1t = list.get(0);
		int[] arr = { 1, 2, 3};
		/*for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		*/
	}
}
