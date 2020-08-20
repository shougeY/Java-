package 第十章.Swing;
 
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class jcheckbox extends JFrame {
	public jcheckbox() {
		setBounds(100, 100, 190, 120);
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
Container c=getContentPane();
c.setLayout(new FlowLayout());
JCheckBox j1=new JCheckBox("1");
JCheckBox j2=new JCheckBox("2");
JCheckBox j3=new JCheckBox("3");
c.add(j1);c.add(j2);;c.add(j3);
setVisible(true);


	}
	public static void main(String[] args) {
		new jcheckbox();
	}

}