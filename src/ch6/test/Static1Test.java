package ch6.test;

class IntTest{
	int nonStaticInt = 0;
	static int staticInt = 0;
	IntTest() {
		nonStaticInt++;
		staticInt++;
	}
}

public class Static1Test {

	public static void main(String[] args) {
		IntTest a = new IntTest();
		System.out.println(a.nonStaticInt +" : "+ IntTest.staticInt);
		
		IntTest b = new IntTest();
		System.out.println(b.nonStaticInt +" : "+ b.staticInt);
		
		IntTest c = new IntTest();
		System.out.println(c.nonStaticInt +" : "+ c.staticInt);
		
	}
}
