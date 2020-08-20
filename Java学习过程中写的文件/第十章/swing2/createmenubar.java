package 第十章.swing2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

public class createmenubar extends JFrame {

	public createmenubar() {setSize(600, 600);
 setBounds(40, 50, 500, 500);
 Container c=getContentPane();
 		JMenuBar menubar = new JMenuBar();
		JMenu r = new JMenu("注册（N）");
		
r.setMnemonic(KeyEvent.VK_N);
		JMenuItem jmi = new JMenuItem("注册用户");
		r.add(jmi);
		jmi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		menubar.add(r);
		JMenu edit=new JMenu("编辑用户信息（E）");

edit.setMnemonic(KeyEvent.VK_E);

menubar.add(edit);
JMenuItem jmimodify;
edit.add(jmimodify=new JMenuItem("修改用户信息（M）", 'M'));
JMenuItem jmiremove;
edit.add(jmiremove=new JMenuItem("删除用户信息（R)", 'M'));

this.setJMenuBar(menubar);
  
 setLayout(null);
 setVisible(true);
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );

	}
	public static void main(String[] args) {
		new createmenubar();
	}

}
