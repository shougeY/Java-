package 第十章.注册;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class rd extends JDialog {
	private JLabel labeleamil = new JLabel("eamial");
	private JTextField usereamial = new JTextField(20);
	private JLabel labelname = new JLabel("用户名");
	private JTextField username = new JTextField(20);
	private JLabel labelsex = new JLabel("性别:");
	private JLabel labelmale = new JLabel("男");
	private JLabel labelfemale = new JLabel("女");
	private JRadioButton male = new JRadioButton();
	private JRadioButton female = new JRadioButton();
	private JLabel labelhobby = new JLabel("爱好：");
	private JLabel labelhobbies[] = new JLabel[4];
	private JCheckBox hobbies[] = new JCheckBox[4];
	private String[] strhobby = { "体育运动", "上网", "看书", "打游戏"

	};
	private JButton buttonsave = new JButton("保存");
	private JButton buttonmodify = new JButton("修改"

	);
	private JButton buttonexit = new JButton("退出");
	private int weight = 280;
	private int height = 400;

	public rd(JFrame parent, String text) {
		super(parent, text);
	}

private void init() {
	JPanel peamil=new JPanel();
	peamil.add(labeleamil);
	peamil.add(usereamial);
	JPanel pname=new JPanel();
	pname.add(labelname);
	pname.add(username);
	JPanel psex=new JPanel();
	ButtonGroup sexradiobutton=new ButtonGroup();
	sexradiobutton.add(male);
	sexradiobutton.add(female);
	psex.add(labelsex);
	psex.add(labelmale);
	psex.add(male);
	psex.add(labelfemale)
	;
	psex.add(female);
	male.setSelected(true);
	JPanel phobby =new JPanel();
	phobby.add(labelhobby);
	for (int i = 0; i < hobbies.length; i++) {
		hobbies[i]=new JCheckBox();
		labelhobbies[i]=new JLabel();
		labelhobbies[i].setText(strhobby[i]);
		phobby.add(hobbies[i]);
		phobby.add(labelhobbies[i]);
	}
	JPanel pbutton=new JPanel();
	pbutton.add(buttonsave);
	pbutton.add(buttonexit);
	JPanel panel=new JPanel();
	panel.add(peamil);
	panel.add(pname);
	panel.add(psex);
	panel.add(phobby);
	panel.add(pbutton);
	add(panel);
	
	
	
}
public void showme(JFrame parent) {
	init();
	setPosition(parent);
	this.validate();
	setVisible(true);
	
}
private void setPosition(JFrame parent) {
	int px=parent.getX();
	int py=parent.getY();
	int pw=parent.getWidth();
	int ph=parent.getHeight();
	int dialogx=px+(pw-getWidth())/2;
	int dialogY=py+(ph-getHeight())/2+40;
	this.setBounds(dialogx, dialogY, getWidth(), getHeight());
	
}
}
