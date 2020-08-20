package 第十章.Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class flowlayout extends JFrame {

	public flowlayout() {
		setTitle("本窗体使用流布局");
		Container c = getContentPane();
		setLayout(new FlowLayout(2, 10, 10));
		for (int i = 0; i < 10; i++) {
			JButton a=new JButton("button" + i);
			a.setBackground(Color.BLACK);
			c.add(a);
//new JButton("button" + i)
		}
		setBackground(Color.green);
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new flowlayout();
	}
}
