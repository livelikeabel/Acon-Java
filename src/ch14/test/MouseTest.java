package ch14.test;

import java.awt.Frame;

public class MouseTest {
	Frame frm;
	
	MouseTest() {		
		frm = new Frame("���콺�̺�Ʈ�� ����.");
	}
	
	private void makeGui() {
		frm.setSize(500, 500);
		frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		MouseTest mt = new MouseTest();
		mt.makeGui();
	}
}
