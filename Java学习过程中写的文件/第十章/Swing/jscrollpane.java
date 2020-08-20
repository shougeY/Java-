package 第十章.Swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class jscrollpane extends JFrame {

	public jscrollpane() {

		Container c = getContentPane();
		JTextArea ta = new JTextArea(50, 50);
		JScrollPane sp = new JScrollPane(ta);
		c.add(sp);
		setTitle("带滚动的文字编辑器");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new jscrollpane();
	}
}
