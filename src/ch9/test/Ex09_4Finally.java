package ch9.test;

public class Ex09_4Finally {
	
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		try {
			int num = 3/0;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("�ݵ�� ����Ǵ� ����");
		}
		System.out.println("���α׷� ���� ����");
	}
}
