package ch5.test;

class BoardObject{
	String writer;
	String date;
	String title;
	
	BoardObject(){}
	BoardObject(String s){
		this.writer = s;
	}
	BoardObject(String s1, String s2){
		this.writer = s1;
		this.date = s2;
	}
}

public class Con1Test {
	
	public static void main(String[] args) {
		BoardObject bo = new BoardObject("abelko");
		bo = new BoardObject("abelko", "lastnight");
		
	
	
	}
}
