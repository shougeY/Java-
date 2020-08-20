package 第十章.Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class jtext  extends JFrame{
	public jtext() {
		setBounds(100, 100, 100, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setSize(200, 2000);
		//c.setBackground(Color.BLACK);
		JTextField j=new JTextField("aaa", 20);
		 JButton jb=new JButton("qingchu");
		 c.add(jb);
			c.add(j);
			j.setFont(new Font("黑体", Font.PLAIN, 20));
		 jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				j.setText("触发事件");
				
			}
		});
		 jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				j.setText(" ");
				j.requestFocus();
				
			}
		});
//		c.add(jb);
//		c.add(j);
		setVisible(true);
	}
	public static void main(String[] args) {
		new jtext();
	}

}
