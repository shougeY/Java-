package 第十章.Swing;

import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class simple extends JFrame implements ActionListener {
	private JButton jb = new JButton("这是一");

	public simple() {
		setLayout(null);
		JFrame j=new  JFrame("这是一个窗口");
		Container c=getContentPane();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE
				);
		jb.setBounds(100, 100, 200, 200);
		jb.addActionListener(this);
		c.add(jb);
		
		setBounds(200, 200, 500, 500);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jb.setText("这是一个按钮");
		
	}public static void main(String[] args) {
		new simple();
	}
	
	

}
