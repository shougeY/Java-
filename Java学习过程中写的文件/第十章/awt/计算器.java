package 第十章.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 计算器 {
	private Frame frame;
	private Button[] allbuttons;
	private TextField field;

	public 计算器() {
		frame = new Frame("awt计算器");
		field = new TextField(20);
		allbuttons = new Button[20];
		String str = "→C√±789/456*123−0.=+";
		for (int i = 0; i < str.length(); i++) {
			allbuttons[i] = new Button(str.substring(i, i + 1));

		}

	}// 初始化窗口，设置布局

	private void init() {
		Panel northPanel = new Panel();
		northPanel.add(field);

		Panel centerP = new Panel();
		GridLayout grid = new GridLayout(5, 4, 2, 2);
		centerP.setLayout(grid);
		for (int i = 0; i < allbuttons.length; i++) {
			centerP.add(allbuttons[i]);

		}
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(centerP, BorderLayout.CENTER);

	}

	public void showMe() {
		init();
		frame.pack();
		frame.setLocation(300, 200);
		frame.setResizable(true);
		frame.setVisible(true);
		addEventHandler();
	}

	public void addEventHandler() {
		for (int i = 0; i < allbuttons.length; i++) {
			allbuttons[i].addActionListener(new CalculateActionHandler());
		}
		field.addActionListener(new CalculateActionHandler());

	}

	double op1 = 0, op2 = 0;
	boolean flag = true;
	String operator = " ";

	private class CalculateActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if ("0123456789.".indexOf(command) != -1) {
				if (flag) {
					field.setText(command);
				} else {
					field.setText(field.getText() + command);

				}
				flag = false;
			}
			else if("+-*/".indexOf(command)!=-1){
				op1=Double.valueOf(field.getText());
				operator=command;
				field.setText(" ");
				

		}
			else if (command.equalsIgnoreCase("=")){
				double res=0;
				String text=field.getText()
						;
				if (text.length()>0) {
					op2=Double.valueOf(text);
					if(operator.equals("+")) {
						res=op1+op2;
					}
					else if (operator.equals("-")) {
						res=op1-op2;
					}
					else if (operator.equals("*")) {
						res=op1*op2;
					}
					else {
						res=op1/op2;
					}
					field.setText(String.valueOf(res));
				}
				flag=true;
				
			}

	}}

	public  static void main (String []args) {
		new 计算器().showMe();
	}

}
