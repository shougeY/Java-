package 第十章.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class awtcalculation {
	private Frame frame;
	private Button[] allbuttons;
	private TextField field;

	public awtcalculation() {
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
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public  static void main (String []args) {
		new awtcalculation().showMe();
	}
}
