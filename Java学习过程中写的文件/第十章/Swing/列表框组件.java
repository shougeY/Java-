package 第十章.Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;



public class 列表框组件 extends JFrame {
	public 列表框组件() {
	setBounds(100, 100, 200, 200);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	Container c=getContentPane();
	c.setLayout(null);
	c.setLayout(null);
	String[] items= {"ys1","ys2","ys3","ys4"};
	JList<String> j1=new JList<>(items);
	DefaultListModel<String> model=new DefaultListModel<String>();
	for(String tmp:items) {
		model.addElement(tmp);
	}
	model.addElement("添加元素");
	j1.setModel(model);

/*

	single__selection;单选；
	SINGLE_INTERVAL_SELECTION;只能连续选择相邻的元素；
MULTIPLE_INTERVAL_SELECTION;默认 随便选；
	
	*/
	j1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//设置选择模式；
	
		JScrollPane js=new JScrollPane(j1);
		js.setBounds(10, 10, 100, 100);
		JButton jj=new JButton("确认");
		jj.setBounds(120, 90, 70, 25);
		jj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				java.util.List<String>  z=j1.getSelectedValuesList();
				for (String tmp: z) {
					System.out.println(tmp);
					
				}
				System.out.println("end");
			}
		});
	setVisible(true);
	c.add(js);
	c.add(jj);

//c.add(j1);
}
	public static void main(String[] args) {
		new 列表框组件();
	}
	
}
