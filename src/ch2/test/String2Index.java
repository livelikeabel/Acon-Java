package ch2.test;

public class String2Index {
	public static void main(String[] args) {
		String str1 = "nice to meet you !!!";
		//index - 위치 (0에서 시작)
		//length - 길이
		System.out.println(str1.length());//문자열의 길이
		System.out.println(str1.charAt(1));//특정 번지의 문자 추출
		System.out.println(str1.indexOf('!'));//특정 문자의 첫번째 위치
		System.out.println(str1.lastIndexOf('!'));//측정 문자의 마지막 위치
		System.out.println(str1.indexOf("to"));
		System.out.println(str1.endsWith("***"));
		System.out.println(str1.endsWith("!"));
		System.out.println(str1.startsWith("***"));
		System.out.println(str1.startsWith("nice"));
	}
}
