package ch2.test;

public class String4Replace {

	public static void main(String[] args) {
		String str1 = "nice to meet you !!!";
		System.out.println(str1.replace('e', 'H'));
		System.out.println(str1.replace("e", "K"));
		System.out.println(str1.replaceAll("!!!", "..."));
		System.out.println(str1);
		String str2 = "     h     i     ";
		System.out.println(str2.trim());
		System.out.println(str2);
		
	}
}
