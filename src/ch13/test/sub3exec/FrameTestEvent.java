package ch13.test.sub3exec;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameTestEvent implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("È°µ¿Áß");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("¹¹Áö?");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("È°µ¿Áß ¾Æ´Ô");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
