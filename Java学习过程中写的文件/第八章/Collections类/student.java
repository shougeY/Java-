package 第八章.Collections类;
import java.lang.Comparable;



public class student implements Comparable
{private String name;
private int xh;
public student () {
	
}
public student (String name,int xh) {
	this.name=name;
	this.xh=xh;
}


	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getXh() {
	return xh;
}
public void setXh(int xh) {
	this.xh = xh;
}
	@Override
	public int compareTo(Object o) {
	
		if (o instanceof student) {
			student s=(student)o;
			return this.xh-s.xh;
					
		}
		
		// TODO Auto-generated method stub
		return 0;
	}
	

}
