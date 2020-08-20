package 第十章.Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class jcombobox extends JFrame {
public jcombobox() {
	setBounds(100, 100, 200, 200);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	Container c=getContentPane();
	c.setLayout(null);
//		String  []items = {"ys1","ys2","ys3"};
JComboBox <String> com=new JComboBox<String>();
String  []items = {"ys1","ys2","ys3"};
ComboBoxModel cm =new DefaultComboBoxModel<>(items);
com.setModel(cm);
JButton j=new JButton("打印");
j.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
System.out.println("xuanzhong suying "+com.getSelectedIndex());
		System.out.println("xuanzhong zhi"+com.getSelectedItem());
	}
});
j.setBounds(100,	 10, 60, 20);
//com.addItem("学生证");
//com.addItem("身份证");
//com.addItem("工作证");
	
com.setBounds(10, 10, 80, 80);
c.add(com);
c.add(j);
com.setEditable(true);
	setVisible(true);
	
	
}

	public static void main(String[] args) {
		new jcombobox();
	}
}
