package ch4.test;

public class Ex04_20Array6 {
	
	public static void main(String[] args) {
		
		int[]num;
		num = new int[] { 1, 2, 3, 4 };
		
		for( int x : num ) {
			System.out.println(" ���� �迭 �� : " + x);
		}
		
		String[] name;
		name = new String[] {"ȫ�浿", "�̼���", "������"};
		
		for(String s : name) {
			System.out.println("���ڿ� �迭 �� :" + s);
		}
	}
}
