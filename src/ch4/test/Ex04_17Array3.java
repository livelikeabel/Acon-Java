package ch4.test;

public class Ex04_17Array3 {
	
	public static void main(String[] args) {
		
		int[] num = new int[4];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		for( int x : num) {
			System.out.println(" 정수 배열 값 : " + x );
		}
		
		String[] name = new String[4];
		
		name[0] = "abelko";
		name[1] = "esung";
		name[2] = "javajigi";
		
		for( String s : name) {
			System.out.println(" 이름 배열 : " + s);
		}
	}
}
