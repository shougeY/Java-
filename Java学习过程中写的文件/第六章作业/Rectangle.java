package 第六章作业;

public class Rectangle extends Shape {

	private Point P;
	private int width;
	private int height;
	public Rectangle (Point P,int x,int y) {
		this.P=P;
		this.width=x;
	this.height=y;
	}
	public Rectangle() {};

	public Point getP() {
		return P;
	}
	public void setP(Point p) {
		P = p;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		double d;
		d = width * height;
		return d;
	}

	@Override
	public boolean iscontains(int x, int y) {
		int a = Math.abs(P.getX()) + width;
		int b = Math.abs(P.getY()) + height;
		if (x > P.getX() && y < P.getY() && P.getdistanceofy(x) > Math.abs(P.getX()) && P.getdistanceofy(x) < a
				&& P.getdistanceofx(y) > Math.abs(P.getY()) && P.getdistanceofx(y) < a) {
			return true;
		} else
			return false;
	}
	@Override
	public String show() {
		String sr;
		// TODO Auto-generated method stub
		sr="the rectangle area:"+String.format("%.2f",getArea());
		System.out.println(sr);
		return sr;
	}

}


