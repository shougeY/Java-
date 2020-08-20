package 第六章作业;

public class Circle extends Shape{
	private Point p;
	private double r;
	public Circle() {};
	public Circle (Point p,double r) {
		this.p=p;
		this.r=r;
	}
	@Override
	public  double getArea() {
		double d;
		double z=Math.PI;
		d=z*r*r;
		return d;
		
		
	}
	
	@Override
	public boolean iscontains(int x, int y) {
		
		if (p.getdistance(x, y)>r) {
		return false;
	}else return true;
	
}
	@Override
	public String show() {
		String sr;
		sr ="the circle area is:"+String.format("%.2f",getArea());
		System.out.println(sr);
			return sr;
	}}
