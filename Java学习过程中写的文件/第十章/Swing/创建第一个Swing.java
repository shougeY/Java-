package 第十章.Swing;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class 创建第一个Swing extends JFrame {
	public void createJFrame(String title) {
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.green);
		jf.setVisible(true);
		jf.setSize(100, 1200);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
	public static void main(String []args) {
		new 创建第一个Swing().createJFrame("创建第一个JFrame");
	}

}
