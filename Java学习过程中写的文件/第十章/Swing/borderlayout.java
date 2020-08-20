package 第十章.Swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class borderlayout extends JFrame {
	String[] b = { BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST };

	String[] bn = { "cb", "nb", "sb", "wb", "eb" };

	public borderlayout() {
		setTitle("这个窗体使用边界布局管理器");
		Container c = getContentPane();
		setLayout(new BorderLayout());
		for (int i = 0; i < b.length; i++) {
			c.add(b[i], new JButton(bn[i]));

		}
		setSize(350, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new borderlayout();
	}
}
