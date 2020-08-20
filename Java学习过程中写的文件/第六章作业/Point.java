package 第六章作业;

public class Point {
	private int x;
	private int y;
	public Point() {}
	public Point (int x,int y) {
		this.x=x;
		this.y=y;
	}
	public double getdistance(int X,int Y) {
		double d;
		d= Math.sqrt(Math.pow(x-X,2)+Math.pow(y-Y, 2));
		return d;
		
	}
	public int getdistanceofx(int y) {
		return Math.abs(y);
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getdistanceofy(int x) {
		return Math.abs(x);
		
	}

}
