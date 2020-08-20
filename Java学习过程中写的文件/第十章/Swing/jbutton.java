package 第十章.Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class jbutton extends JFrame {
	public jbutton() {

		URL url = jbutton.class.getResource("OIP.IE8xl0Km-aUugWAj-i4S8QHaJ0.jpeg");
		Icon icon = new ImageIcon(url);

		setLayout(new GridLayout(3, 2, 5, 5));
		Container c = getContentPane();
		for (int i = 0; i < 5; i++) {
			JButton j = new JButton("button" + i, icon);
			c.add(j);
			if (i % 2 == 0) {
				j.setEnabled(false);
				j.setBorderPainted(false);

			}
		}
JButton jb=new JButton();
jb.setMaximumSize(new Dimension(90,30));
jb.setIcon(icon);
jb.setToolTipText("图片按钮");
jb.setHideActionText(true);
jb.setBorderPainted(false);
jb.setBorder(BorderFactory.createLineBorder(Color.red));
jb.setToolTipText("图片按钮");
jb.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "弹出对话框");
		
	}
});
c.add(jb);
setSize(200, 200);
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
setVisible(true);

	}
	public static void main(String[] args) {
		new jbutton();
	}

}
