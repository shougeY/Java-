package 第十章.Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class jtextarea  extends JFrame{
	public jtextarea() {
		setBounds(100, 100, 100, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setSize(200, 2000);
		JTextArea j=new JTextArea()
				;
		j.setFont(new Font("楷体", Font.BOLD, 20));
		JScrollPane js=new JScrollPane();
		c.add(j);
		c.add(js);
		
		setVisible(true);

	}
public static void main(String[] args) {
	new jtextarea();
}
}
