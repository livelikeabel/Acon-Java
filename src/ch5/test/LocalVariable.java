package ch5.test;

public class LocalVariable {
	int mint = 7;
	void printLocal() {
		int mint = 8;
		System.out.println(mint);
	}
	void print() {
		System.out.println(mint);
	}
	
	public static void main(String[] args) {
		LocalVariable lv = new LocalVariable();
		lv.print();
		lv.printLocal();
	}
}
