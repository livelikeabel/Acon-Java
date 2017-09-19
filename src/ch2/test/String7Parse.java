package ch2.test;

public class String7Parse {
	
	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1 + str2);

		int intVar1 = Integer.parseInt(str1);
		int intVar2 = Integer.valueOf(str2);
		System.out.println(intVar1 + intVar2);
	}
}
