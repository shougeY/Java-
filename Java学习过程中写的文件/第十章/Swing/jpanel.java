package 第十章.Swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class jpanel  extends JFrame{
	public jpanel() {
		Container c=getContentPane();
		c.setLayout(new GridLayout(2, 1, 10, 10));
		JPanel p1=new JPanel(new GridLayout(1, 3, 10, 10));
		JPanel p2=new JPanel(new GridLayout(1,2, 10, 10));
		
		JPanel p3=new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel p4=new JPanel(new GridLayout(2, 1, 10, 10));
		p1.add(new JButton("1"));
		p2.add(new JButton("2"));
		p3.add(new JButton("3"));
		p4.add(new JButton("4"));
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		setVisible(true);
		setSize(40, 50);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		


	}
	public static void main(String[] args) {
		new jpanel();
		
	}

}
