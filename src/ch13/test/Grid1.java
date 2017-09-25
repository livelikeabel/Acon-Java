package ch13.test;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Grid1 {
	
	Frame frm;
	Button b1, b2, b3, b4, b5, b6;
	GridLayout grid;
	
	public Grid1() {
		frm = new Frame("hi");
		grid = new GridLayout(3, 2);
		b1 = new Button("b1");
		b2 = new Button("b2");
		b3 = new Button("b3");
		b4 = new Button("b4");
		b5 = new Button("b5");
		b6 = new Button("b6");
		frm.setLayout(grid);
		frm.setSize(300, 300);
		frm.add(b1);
		frm.add(b2);
		frm.add(b3);
		frm.add(b4);
		frm.add(b5);
		frm.add(b6);
		frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		Grid1 g1 = new Grid1();
	}
}
