package 第八章.第八章实验三;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class school {
	Scanner sc=new Scanner(System.in);
	private String name;
	private Set<student> s;

	public school() {

	}

	public school(String name) {
		this.name = name;

	}

	public void addstudent() {
		System.out.println("输入学生名字");
		String rsa=sc.next();
		student  c= new student(rsa);
		Set  s=new TreeSet();
		s.add(c);
		this.s=s;
	}

	public boolean remaove(String name) {
		Iterator it = s.iterator();
		int a = 0;
		while (it.hasNext()) {
			student d = (student) it.next();
			if (d.getName().equalsIgnoreCase(name)) {
				a = 1;
				s.remove(d);
				return true;
			}

		}
		if (a == 0) {
			return false;

		}
		return false;

	}

	public void show() {
		Iterator<student> it = s.iterator();
		System.out.println("学生：");
		while (it.hasNext()) {
			student a = it.next();
			System.out.println(a.getName());

		}
	}

	public Map<course, Integer> account() {

		Iterator it = s.iterator();
		Map<course, Integer> M = new HashMap();
		List list = new ArrayList();
		Set set = new TreeSet();
		while (it.hasNext()) {
			student t = (student) it.next();

			Iterator g = t.getSet().iterator();
			while (g.hasNext()) {
				course a = (course) g.next();
				list.add(a);
				set.add(a);

			}
		}
		Iterator z = set.iterator();
		while (z.hasNext()) {
			course gf = (course) z.next();
			int b = Collections.frequency(list, gf);
			M.put(gf, b);

		}
		System.out.println(M);
		return M;

	}
}