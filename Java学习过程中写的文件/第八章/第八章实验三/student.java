package 第八章.第八章实验三;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class student implements Comparable {
	Scanner sc = new Scanner(System.in);
	private String name;
	private Set<course> set;

	public student() {

	};

	public student(String name, Set<course> set) {
		this.name = name;
		this.set = set;
	}

	public student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<course> getSet() {
		return set;
	}

	public void setSet(Set<course> set) {
		this.set = set;
	}

	public void addcourse() {
		Set s=new TreeSet();
	
		while(true) {System.out.println("输入课程(quit表示退出）");
		String n=sc.nextLine();
		int zyhy=2;
		if(n.equalsIgnoreCase("quit")) {
			break;
		}
		course t=new course (n,zyhy);
		
		
		
		s.add(t);
		

	} this.set=s;}

	public boolean removecourse(course c) {
		Iterator it = set.iterator();int a=0;
		while (it.hasNext()) {
			course d = (course) it.next();
			if(c.getName().equalsIgnoreCase(d.getName())) {
				a=1;
			set.remove(c);return true;
		}
		
		}
		if (a==0) {
		return false;}
		return false;	
	}

	public void show() {
		System.out.println("学生名称" + name);
		Iterator it = set.iterator();
		System.out.println("课程名称");
		while (it.hasNext()) {
			course a = (course) it.next();
			System.out.println(a.getName() + a.getScore());

		}

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		
		if (o instanceof student ) {
			student s=(student) o;
			return this.name.compareTo(s.name);
		}
		return 0;

	
	}

}
