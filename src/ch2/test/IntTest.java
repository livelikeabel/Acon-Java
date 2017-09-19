package ch2.test;

public class IntTest {

	public static void main(String[] args) {
		byte b1 = 7;
		byte b2 = 8;
		byte b3 = (byte)(b1 + b2); // 더하기 연산을 하면 디폴트 값인 인트로 변환되어 바이트 형에 대입할 수 없다.
		byte b4 = 7 + 8;
		
		short s1 = 77;
		short s2 = 88;
		short s3 = (short)(s1 + s2);
		short s4 = 77 + 88;
		
		int i1 = 777;
		int i2 = 888;
		int i3 = i1 + i2;
		int i4 = 777 + 888;
		
		long l1 = 7777L;
		long l2 = 8888L;
		long l3 = l1 + l2;
		long l4 = 777 + 888;
		
		byte bb1 = (byte) 210000000;
		System.out.println(bb1);
		
	}
}
