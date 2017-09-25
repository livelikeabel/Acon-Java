package ch13.test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Flow1 {

	Frame frm;
	FlowLayout flow;
	Button b1, b2, b3;
	
	Flow1() {
		frm = new Frame();
		flow = new FlowLayout();
		b1 = new Button("hi");
		b2 = new Button("hello");
		b3 = new Button("nice to meet you");
		frm.setSize(150, 150);
		frm.setLayout(flow);
		frm.add(b1);
		frm.add(b2);
		frm.add(b3);
		frm.setVisible(true);
	}
	public static void main(String[] args) {
		Flow1 f1 = new Flow1();
	}
}
