package ch4.test;

public class Ex04_13_Break {
	public static void main(String[] args) {
		
		int n = 1;
		while( n <= 10 ) {
			System.out.println( n + "HelloWorld" );
			n++;
			  if( n == 8) break;
		}
			System.out.println("n���� 8�̸� while���� ���� ����");
	}
}
