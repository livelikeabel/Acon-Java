package ch6.test;

public class Access1Private {
	private int pint = 777;
	private void pMethod() {
		System.out.println("Accessone");
	}
	public int getPint() {
		return pint;
	}
	public void setPint(int pint) {
		this.pint = pint;
	}
}
