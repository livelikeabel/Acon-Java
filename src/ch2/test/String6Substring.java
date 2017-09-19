package ch2.test;

public class String6Substring {

	public static void main(String[] args) {
		String str1 = "nice to meet you !!!";
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5, 15));//시작번지 포함, 끝번지 불포함
		System.out.println(str1);
	}
}
