package 第六章作业;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Scanner src1 = new Scanner(System.in);
		int i = src1.nextInt();

		
		int a, b, c, d, e, f, g, h;
		a = src1.nextInt();
		b = src1.nextInt();
		c = src1.nextInt();
		d = src1.nextInt();
		e = src1.nextInt();
		f = src1.nextInt();
		g = src1.nextInt();
		Point A = new Point(a, b);
		Point B = new Point(d, e);
Circle C=new Circle (A,c);
Rectangle R=new Rectangle(B,f,g);
C.show();
R.show();

	}

}
