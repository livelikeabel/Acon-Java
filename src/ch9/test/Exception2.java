package ch9.test;

public class Exception2 {

	public static void main(String[] args) {
		try {
		//	System.out.println(3/0);
		//	String str = null;
		//	System.out.println(str.length());
			int[] arr = {1, 2, 3};
			for(int i = 0; i < 5; i++)
				System.out.println(arr[i]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexError");
		} catch (NullPointerException e) {
			System.out.println("Catch Null");
		} catch (ArithmeticException e) {
			System.out.println("나누기가 잘못 되었습니다.");
		}

	}
}
