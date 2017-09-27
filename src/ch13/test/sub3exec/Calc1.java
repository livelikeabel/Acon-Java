package ch13.test.sub3exec;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Calc1 {
	Frame frm;
	FrameTestEvent frmEvent;
	Panel pan;
	GridLayout grid;
	TextField field;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
	
	Calc1() {
		frm = new Frame();
		frmEvent = new FrameTestEvent();
		pan = new Panel();
		grid = new GridLayout(4, 4);
		field = new TextField();
		b1 = new Button("1");
		b1 = new Button("2");
		b1 = new Button("3");
		b1 = new Button("+");
		b1 = new Button("4");
		b1 = new Button("5");
		b1 = new Button("6");
		b1 = new Button("-");
		b1 = new Button("7");
		b1 = new Button("8");
		b1 = new Button("9");
		b1 = new Button("*");
		b1 = new Button("0");
		b1 = new Button("cls");
		b1 = new Button("=");
		b1 = new Button("/");
	}
	
	void makeGui() {
		frm.setSize(300, 300);
		frm.setVisible(true);
		frm.addWindowListener(frmEvent);
		frm.add(field, BorderLayout.NORTH);
		frm.add(pan, BorderLayout.CENTER);
		pan.setLayout(grid);
		pan.add(b1);
		pan.add(b2);
		pan.add(b3);
		pan.add(b4);
		pan.add(b5);
		pan.add(b6);
		pan.add(b7);
		pan.add(b8);
		pan.add(b9);
		pan.add(b10);
		pan.add(b11);
		pan.add(b12);
		pan.add(b13);
		pan.add(b14);
		pan.add(b15);
		pan.add(b16);
	}
	
	public static void main(String[] args) {
		Calc1 c1 = new Calc1();
		c1.makeGui();
	}
}
