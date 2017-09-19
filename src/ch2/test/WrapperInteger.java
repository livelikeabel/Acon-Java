package ch2.test;

public class WrapperInteger {

	public static void main(String[] args) {
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("Integer.SIZE : " + Integer.SIZE);
		
		Integer integerVar = new Integer(777);
		byte byteVar = integerVar.byteValue();
		short shortVar = integerVar.shortValue();
		int intVar = integerVar.intValue();
		long longVar = integerVar.longValue();
		float floatVar = integerVar.floatValue();
		double doubleVar = integerVar.doubleValue();
		
		System.out.println("byteVar : " + byteVar);
		System.out.println("shortVar : " + shortVar);
		System.out.println("intVar : " + intVar);
		System.out.println("longVar : " + longVar);
		System.out.println("floatVar : " + floatVar);
		System.out.println("doubleVar : " + doubleVar);
	}
}
