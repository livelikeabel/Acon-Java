package ch2.test;

public class MathTest {
//Math Class�� �޼ҵ忡 ���� �˾ƺ���.
	public static void main(String[] args) {
		System.out.println(Math.PI);
		double d1 = 0.1, d2 = 0.9, d3 = 0.4, d4 = 0.5;
		System.out.println(Math.ceil(d1));//ceil�� �ø� �޼ҵ� 
		System.out.println(Math.floor(d2));//����
		System.out.println(Math.round(d3));//�ݿø�
		System.out.println(Math.round(d4));//�ݿø�
		int i1 = 100, i2 = 200;
		System.out.println(Math.min(i1, i2));
		System.out.println(Math.max(i1, i2));
		System.out.println(Math.pow(2, 3));//2�� 3����
		
		
		double d5 = Math.random();
		double d6 = Math.random();
		System.out.println(d5);
		System.out.println(d6);
		
		System.out.println((int)(Math.random()*100));
		System.out.println((int)(Math.random()*100));
		System.out.println((int)(Math.random()*100));
	}
}
