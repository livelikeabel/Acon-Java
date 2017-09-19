package ch2.test;

public class String5Split {
	
	public static void main(String[] args) {
		String str1 = "010-1588-5588";
		String [] strArr = str1.split("-");
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		
		String str2 = "Hi Every One !!!";
		System.out.println(str2.toLowerCase());//모두 소문자로 바꾸어라
		System.out.println(str2.toUpperCase());//모두 대문자로 바꾸어라
		
	}
}
