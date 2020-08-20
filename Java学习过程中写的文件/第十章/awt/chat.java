package 第十章.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class chat {
	private Frame frame;
	private TextArea area;
	private TextField field;
	private Button button;

	public chat() {
		frame = new Frame("窗口名");
		area = new TextArea(10, 30);
		area.setFont(new Font("Times New Roman", Font.BOLD, 14));//根据指定的名称，样式和磅值创建新字体。
		area.setEditable(false);
		field = new TextField(26);
		button = new Button("发送");

	}

	private void init() {
		Panel centerPanel = new Panel();
		centerPanel.add(area);
		Panel southPanel = new Panel();
		southPanel.add(field);
		southPanel.add(button);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.add(southPanel, BorderLayout.SOUTH);

	}

	private void addeventhandler() {
		button.addActionListener(new TextbuttonactionHandler());
		field.addActionListener(new TextbuttonactionHandler());
		field.addTextListener(new TextfieldchangeHandler());

	}

	public void showMe() {
		init();
		addeventhandler();
		frame.pack();
		frame.setVisible(true);
	}

	private class TextbuttonactionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			area.append(field.getText() + "\n");
			field.setText(" ");

		}
	}

	private class TextfieldchangeHandler implements TextListener {

		@Override
		public void textValueChanged(TextEvent e) {
			if (field.getText().equals("hehe")) {
				area.append("\\(^0^)/\n");
				field.setText(" ");

			}

		}

	}

	
	public static void main(String []args) {
		new chat().showMe();
	}
}