package ch9.test;

public class Ex09_4Finally {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			int num = 3/0;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("반드시 시행되는 문장");
		}
		System.out.println("프로그램 정상 종료");
	}
}
