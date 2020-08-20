package 第十章.Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

public class jpassword extends JFrame {

	public jpassword() {
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 100, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setSize(200, 2000);
		JPasswordField jp=new JPasswordField(20);
	jp.setEchoChar('#');
	jp.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 char[] ch=jp.getPassword();
			 String s=new String(ch);
			 System.out.println(s);
			
			
		}
	});
		c.add(jp);
		
		
		setVisible(true);

	}
	public static void main(String[] args) {
		new jpassword()
		;
	}
}
