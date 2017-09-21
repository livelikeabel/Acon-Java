package ch4.test;

public class Ex04_20Array6 {
	
	public static void main(String[] args) {
		
		int[]num;
		num = new int[] { 1, 2, 3, 4 };
		
		for( int x : num ) {
			System.out.println(" 정수 배열 값 : " + x);
		}
		
		String[] name;
		name = new String[] {"홍길동", "이순신", "유관순"};
		
		for(String s : name) {
			System.out.println("문자열 배열 값 :" + s);
		}
	}
}
