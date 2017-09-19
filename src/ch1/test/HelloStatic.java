package ch1.test;

public class HelloStatic {
	
	int generalInt = 88;
	static int stInt = 777;
	public static void main(String[] ars) {
		HelloStatic hs = new HelloStatic();
		System.out.println(stInt);
		System.out.println(hs.generalInt);
		System.out.println(hs.stInt);
	}
}
