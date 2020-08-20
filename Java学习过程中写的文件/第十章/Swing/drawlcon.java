package 第十章.Swing;

import java.awt.*;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class drawlcon implements Icon {
	private int width;
	private int height;

	public drawlcon(int w, int h) {
		this.height = h;
		this.width = w;
	}

	@Override
	public void paintIcon(Component argo, Graphics arg1, int x, int y) {
		arg1.fillOval(x, y, width, height);
	}



	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	public static void main(String[] args) {
		drawlcon icon=new drawlcon(15,15);
		JLabel j=new JLabel("测试",icon,SwingConstants.CENTER);
		JFrame jf =new JFrame();
		Container c=jf.getContentPane();
		c.add(j);
		jf.setVisible(true);
		
	}

}
