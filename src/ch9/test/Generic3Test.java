package ch9.test;

import java.util.ArrayList;

class People{}
class Man extends People {}
class Woman extends People {}

public class Generic3Test {


	public void main(String[] args) {
		Generic3Test g3t = new Generic3Test();
		
		ArrayList<Man> manlist = new ArrayList<Man>();
		g3t.printer(manlist);
		ArrayList<Woman> womanlist = new ArrayList<Woman>();
		//g3t.printer(strlist);// error
		
	}
	
	public void printer(ArrayList<? extends People> list) {
		
	}
	
	public void printer2(ArrayList<? super People> list) {
		
	}
}
