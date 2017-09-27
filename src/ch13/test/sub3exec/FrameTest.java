package ch13.test.sub3exec;

import java.awt.Frame;

public class FrameTest {

	Frame frm;
	FrameTestEvent event;
	
	FrameTest(){
		frm = new Frame("창을 닫자");		
		event = new FrameTestEvent();
	}
	
	void makeGui() {
		frm.setSize(300,300);
		frm.setVisible(true);
		frm.addWindowListener(event);
		//이벤트 감지 센서 부착(이벤트 발생시 처리 로직)
	}
	
	public static void main(String[] args) {
		FrameTest ft = new FrameTest();
		ft.makeGui();
	}
	
}//class