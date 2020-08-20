package 第十章.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 事件尝试 implements ActionListener{
	private Frame frame;
	private Button button;
	private TextArea area;
	public 事件尝试() {
		
	frame=new Frame("事件测试");
	button =new Button ("单击我");
	area=new TextArea(10,20);
	
	}
	private void init() {
		frame.add(button, BorderLayout.NORTH);
		frame.add(area,BorderLayout.CENTER);
		
	}
	public void showMe() {
		init();
		button.addActionListener(this);
		frame.setBounds(50, 50, 400, 400);
		frame.setVisible(true);
		
	}

	 @Override
	public void actionPerformed(ActionEvent e) {
		area.append("按钮被点击"+"\n");
		
	}
	/*button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			area.append(e.getActionCommand（）+"按钮被点击"+"\n");
		}
	});*/
	public static void main(String []args) {
		new 事件尝试().showMe();
	}
}
