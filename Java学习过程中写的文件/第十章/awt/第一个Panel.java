package 第十章.awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class 第一个Panel {
	public static void main(String []args) {
		Frame f=new  Frame("QQ登录界面");
		Panel p=new Panel();
		p.add(new Label("qq号"));
		p.add(new TextField(20));
		f.add(p);
		f.pack();
		f.setVisible(true);
		
		
	}

}
