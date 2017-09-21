package ch5.test;

public class LocalVarTest {
	
	int memberInt = 77;
	public void memberMethod() {
		int memberInt = 0;
		System.out.println(this.memberInt);
	}
	public static void main(String[] args) {
		LocalVarTest test = new LocalVarTest();
		test.memberMethod();
		System.out.println(test.memberInt);
		
	}
}
