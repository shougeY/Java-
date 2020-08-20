package 第八章.treeset;

public class student implements Comparable {
	private String name;
	private int age;
	public student() {}
public student(String name,int age) {
	this.name=name;
	this.age=age;
}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(Object obj) {
		if(obj instanceof student){
			student stu = (student)obj;
			return this.name.compareTo(stu.name);
//this位于obj的前面，返回负整数；相同，返回0； this位于obj的后面，返回正整数；
		}
		return 0;
	}}
