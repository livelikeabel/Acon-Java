package ch13.test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panel1 {
	
	Frame frm = new Frame("New Window");
	Panel pan = new Panel();
	
	public Panel1() {
		frm.setSize(300, 300);
		frm.setBackground(Color.RED);
		pan.setBackground(Color.YELLOW);
		frm.add(pan);
		frm.setVisible(true);
	}
	public static void main(String[] args) {
		Panel1 p1 = new Panel1();
		
	}
}
