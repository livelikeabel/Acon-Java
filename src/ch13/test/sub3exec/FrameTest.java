package ch13.test.sub3exec;

import java.awt.Frame;

public class FrameTest {

	Frame frm;
	FrameTestEvent event;
	
	FrameTest(){
		frm = new Frame("â�� ����");		
		event = new FrameTestEvent();
	}
	
	void makeGui() {
		frm.setSize(300,300);
		frm.setVisible(true);
		frm.addWindowListener(event);
		//�̺�Ʈ ���� ���� ����(�̺�Ʈ �߻��� ó�� ����)
	}
	
	public static void main(String[] args) {
		FrameTest ft = new FrameTest();
		ft.makeGui();
	}
	
}//class