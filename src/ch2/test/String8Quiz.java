package ch2.test;

public class String8Quiz {
	
	public static void main(String[] args) {
		String str1 = "Korean Air 747 Flight";
		String str2 = "Asiana Air 905 Flight";

		System.out.println(
			Integer.parseInt(str1.substring(11, 14)) +
			Integer.parseInt(str2.substring(11, 14))
		);
		
		
		
	}
}
