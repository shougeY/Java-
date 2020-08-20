package 第十章a;

import java.awt.Color;
import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class imageicon extends JFrame {
	public imageicon() {
		Container c=getContentPane();
		JLabel jl=new JLabel("这是一个标签", SwingConstants.CENTER);
		URL url =imageicon.class.getResource("bingwallpaper.jpg");
		
				Icon icon=new ImageIcon(url);
		
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.CENTER
				);
		jl.setOpaque(true);
		c.add(jl);
		setSize(200,100);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE
				);
		setBackground(Color.darkGray);
		
		
	}

	public static void main(String[] args) {
		new imageicon();

	}
}
