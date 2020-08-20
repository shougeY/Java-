package 第十章.awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class eventadapterTest {
	private Frame frame;
	public eventadapterTest() {
		frame=new Frame();
	}
	public void showMe() {
		frame.addWindowListener(new WindowCloseHandler());
		frame.setBounds(100, 100,200, 200);
		frame.setVisible(true);
		
	}
	private class WindowCloseHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
public static void main(String []args) {
	new eventadapterTest().showMe();
}
	
	

}
