package ch13.test;

import java.awt.Color;
import java.awt.Frame;

public class Frame1 {
	Frame frm = new Frame();
	public Frame1() {
		frm.setSize(300, 300);
		frm.setBackground(Color.lightGray);
		frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		Frame1 f1 = new Frame1();
		
	}
}
