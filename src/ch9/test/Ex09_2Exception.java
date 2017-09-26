package ch9.test;

public class Ex09_2Exception {
	public static void main(String[] args) {
		System.out.println("Start");
	  try {
		  	int value = 0;
		  	int num = 3/value;
		  	int num2 = num + 100;
	  } catch(ArithmeticException e) {
		  	e.printStackTrace();
		  	//System.out.println( e.getMessage());
	  }
	  System.out.println("프로그램 정상 종료");
	}
}
