package 第十章.Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JDialog窗体 extends JDialog {
	public JDialog窗体(JFrame frame) {
		super(frame, "kjfaks", false);
		Container c = getContentPane();
		c.add(new JLabel("这是一个对话框"));
		setVisible(true);
		setBounds(100, 100, 100, 100);

	}

	public static void main(String[] args) {
//		new JDialog窗体();
		JFrame f=new JFrame("父窗体");
		f.setBounds(300, 300, 300, 300);
		Container c=f.getContentPane()
				;
	c.setBackground(Color.gray);
		JButton btn =new JButton("弹出对话框");
		c.setLayout(new FlowLayout());
		c.add(btn);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JDialog窗体 d=new JDialog窗体(f);
			d.setVisible(true);


			// TODO Auto-generated method stub
			
		}
	});
	
		
	}
}
