package 第十章.Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class wanggezu {
	JFrame f = new JFrame();
	Container c;

	void createframe() {
		f.setSize(800, 600);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		c = f.getContentPane();
		c.setLayout(new GridBagLayout());
		f.setLocationRelativeTo(null);

	}

	void init() {
		GridBagConstraints g1 = new GridBagConstraints();
		g1.gridx = 0;
		g1.gridy = 0;

		c.add(new JButton("组件1"), g1);
		GridBagConstraints g2 = new GridBagConstraints();
		g2.gridx = 1;
		g2.gridy = 1;
		c.add(new JButton("组件2"), g2);

		GridBagConstraints g3 = new GridBagConstraints();
		g3.gridx = 3;
		g3.gridy = 3;

		c.add(new JButton("组件3"), g3);

	}
	void cratebutton() {
		for(int i=0;i<9;i++) {
			GridBagConstraints g1 = new GridBagConstraints();
			g1.gridx = i;
			g1.gridy = 0;

			c.add(new JButton("组件3"), g1);
			GridBagConstraints g2 = new GridBagConstraints();
			g2.gridx = 0;
			g2.gridy = i;

			c.add(new JButton("组件3"), g2);
					}
	}
	void init2() {
		GridBagConstraints g1 = new GridBagConstraints();
		g1.gridx = 1;
		g1.gridy = 1;

		c.add(new JButton("组件1"), g1);
		GridBagConstraints g2 = new GridBagConstraints();
		g2.gridx = 2;
		g2.gridy = 2;
		g2.gridwidth=2;
		g2.gridheight=1;
		c.add(new JButton("组件2"), g2);

		GridBagConstraints g3 = new GridBagConstraints();
		g3.gridx = 4;
		g3.gridy = 4;
g3.gridheight=2;
g3.gridwidth=2;
		c.add(new JButton("组件3"), g3);

		
	}
	void init3() {
		GridBagConstraints g1 = new GridBagConstraints();
		g1.gridx = 1;
		g1.gridy = 1;
g1.gridheight=2;
g1.gridwidth=2;
		c.add(new JButton("none"), g1);
		GridBagConstraints g2 = new GridBagConstraints();
		g2.gridx = 3;
		g2.gridy = 1;
		g2.gridwidth=2;
		g2.gridheight=2;
		g2.fill=GridBagConstraints.HORIZONTAL;
		c.add(new JButton("HORIZONTAL"), g2);

		GridBagConstraints g3 = new GridBagConstraints();
		g3.gridx = 5;
		g3.gridy = 1;
g3.gridheight=2;
g3.gridwidth=2;
g3.fill=GridBagConstraints.VERTICAL;
		c.add(new JButton("VERTICAL"), g3);

		GridBagConstraints g4 = new GridBagConstraints();
		g4.gridx = 9;
		g4.gridy = 1;
g4.gridheight=2;
g4.gridwidth=2;
g4.fill=GridBagConstraints.BOTH;
		c.add(new JButton("both"), g4);

		
	}
	void init4() {
		GridBagConstraints g1 = new GridBagConstraints();
		g1.gridx = 1;
		g1.gridy = 1;
g1.gridheight=2;
g1.gridwidth=2;
g1.anchor=GridBagConstraints.CENTER;
		c.add(new JButton("@"), g1);
	g1.fill=GridBagConstraints.NORTH;
	g1.anchor=GridBagConstraints.CENTER;
	JPanel p=new JPanel();
	p.setBackground(Color.GREEN);
	c.add(p,g1);

		
	}
	void init5() {
		GridBagConstraints g1 = new GridBagConstraints();
		g1.gridx = 1;
		g1.gridy = 1;

g1.anchor=GridBagConstraints.CENTER;
g1.insets=new Insets(50, 100, 50, 100);
		c.add(new JButton("@"), g1);

		
	}
	void init6() {
		GridBagConstraints g1 = new GridBagConstraints();
		g1.gridx = 1;
		g1.gridy = 1;
		g1.ipadx=10;
		g1.ipady=10;
g1.gridheight=2;
g1.gridwidth=2;
c.add(new JButton("组件一"), g1);
		GridBagConstraints g2 = new GridBagConstraints();
		g2.gridx = 5;
		g2.gridy = 6;
g2.gridheight=2;
g2.ipadx=-10;
g2.ipady=-10;
g2.gridwidth=2;

		c.add(new JButton("组件二"), g2);


		
	}

	void init7() {
		GridBagConstraints g1 = new GridBagConstraints();
		g1.gridx = 1;
		g1.gridy = 1;
g1.gridheight=2;
g1.gridwidth=2;
g1.anchor=GridBagConstraints.CENTER;
g1.weightx=10;
g1.weighty=10;
		c.add(new JButton("@"), g1);

		
	}
	public static void main(String[] args) {
		wanggezu d = new wanggezu();
		d.createframe();
d.cratebutton();
		d.init7();
		d.f.setVisible(true);
		

	}
}
