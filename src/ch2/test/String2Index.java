package ch2.test;

public class String2Index {
	public static void main(String[] args) {
		String str1 = "nice to meet you !!!";
		//index - ��ġ (0���� ����)
		//length - ����
		System.out.println(str1.length());//���ڿ��� ����
		System.out.println(str1.charAt(1));//Ư�� ������ ���� ����
		System.out.println(str1.indexOf('!'));//Ư�� ������ ù��° ��ġ
		System.out.println(str1.lastIndexOf('!'));//���� ������ ������ ��ġ
		System.out.println(str1.indexOf("to"));
		System.out.println(str1.endsWith("***"));
		System.out.println(str1.endsWith("!"));
		System.out.println(str1.startsWith("***"));
		System.out.println(str1.startsWith("nice"));
	}
}
