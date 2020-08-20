package 第十章.Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class simpleevent extends JFrame {
	private JButton jb = new JButton("我是按钮，单击我");

	public simpleevent() {
		setLayout( null);
		JFrame j = new JFrame("这是一个窗口");
		Container c = getContentPane();
		jb.setBounds(10, 10, 100, 30);
		c.setBounds(20, 20, 300, 400);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jb.addActionListener(new jbaction());
		c.add(jb);
		setVisible(true);

	}
	class jbaction implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			jb.setText("我被单击了");
		 
	}}
	public static void main(String[] args) {
		new simpleevent();
	}
	

}
