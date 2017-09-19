package ch1.test;

public class HelloReturn {
 
	public static void main(String[] args) {
		int a = 123;
		int b = 456;
		int c = plus2(a, b);
		System.out.println(c);
	}

	private static int plus2(int a, int b) {
		return a + b;
	}
}
