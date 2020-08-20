package 第十章.Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class jradio extends JFrame {
	public jradio() {
		setBounds(100, 100, 100, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JRadioButton left = new JRadioButton("向左走");
		JRadioButton right = new JRadioButton("向右走");
		c.add(left);

		c.add(right);
		ButtonGroup group = new ButtonGroup();
		group.add(right);
		group.add(left);
		left.setSelected(true);
		JButton btn = new JButton("打印");
btn.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(left.getText()+"按钮选中状态"+left.isSelected());
		System.out.println(right.getText()+"按钮选中状态"+right.isSelected());
		group.clearSelection();
	}
});c.add(btn);
	}

	public static void main(String[] args) {
		new jradio();
	}

}
