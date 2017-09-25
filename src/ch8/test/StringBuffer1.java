package ch8.test;

public class StringBuffer1 {
	
	public static void main(String[] args) {
		String s1 = new String("hi");
		System.out.println(s1.concat(" seoul"));
		System.out.println(s1);
		
		StringBuffer sb1 = new StringBuffer("hi");
		System.out.println(sb1.append(" seoul"));
		System.out.println(sb1);
		System.out.println(sb1.charAt(5));
		System.out.println(sb1.deleteCharAt(5));
		System.out.println(sb1.indexOf("i"));
		System.out.println(sb1.insert(5, "o"));
		System.out.println(sb1.lastIndexOf("u"));
		System.out.println(sb1.length());
		System.out.println(sb1.reverse());
		System.out.println(sb1.substring(2, 7));
	
	}
}
