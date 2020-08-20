package 第十章.Swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class gridlayout  extends JFrame{ 
	public  gridlayout() {
		Container c= getContentPane();
		setLayout(new GridLayout(7, 3, 5, 5));
		for(int i=0;i<20;i++) {
			c.add(new JButton("button"+i));
			
		}
		setSize(300, 300);
		setTitle("这是一个使用网格布局管理器的窗体");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
public static void main(String[] args) {
	new gridlayout();
}
}
