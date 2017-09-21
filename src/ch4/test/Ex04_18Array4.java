package ch4.test;

public class Ex04_18Array4 {
	
	public static void main(String[] args) {
		
		int[] num = { 1, 2, 3, 4 };
		
		for(int x : num) { 
			System.out.println("정수 배열 값 : " + x);
		}
		
		String[] name = {"고의성", "고예린", "고예은"};
		
		for(String s : name) {
			System.out.println("문자열 배열 값 : " + s);
		}
		 
	}

}
