package ch13.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Border2 {
	
	Frame frm;
	Button b1, b2, b3, b4, b5;
	BorderLayout grid;
	
	public Border2() {
		frm = new Frame("hi");
		grid = new BorderLayout(3, 2);
		b1 = new Button("b1");
		b2 = new Button("b2");
		b3 = new Button("b3");
		b4 = new Button("b4");
		b5 = new Button("b5");
		frm.setLayout(grid);
		frm.setSize(300, 300);
		frm.add(b1, BorderLayout.CENTER);
		frm.add(b2, BorderLayout.NORTH);
		frm.add(b3, BorderLayout.SOUTH);
		frm.add(b4, BorderLayout.EAST);
		frm.add(b5, BorderLayout.WEST);
		frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		Border2 g1 = new Border2();
	}
}
