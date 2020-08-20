package 第八章;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class List接口 {
	public static void main(
			String[] args) {/*
							 * 运行eclipse有的时候不运行刚写的类，老是运行别的以前的类，删除了以前的类就啥都不运行。找了好久的原因，最后发现，刚写的类没有main（）或者有误。
							 * 这和java的特点有关，程序的运行总是main（）方法作为开始，那么既然现在的类不定义main（），就可以视作一个功能类，入口在原来的类，
							 * 当然要从原来的程序开始运行啦。 改进方法就是寻找下刚写的类main（）有没有误，或者整个程序有没有误。改过之后在运行就ok了。main 写成了mian;
							 */

		List list = new ArrayList();
		list.add("java");
		list.add("jfalj");
		list.add("ljfaj");
		list.add("j;ah");
		list.add(1, "java");
		System.out.println(list);
		Collection c = new ArrayList();
		c.add("lkjaf");
		c.add("jlkaf");
		c.add("jlajf");
		list.set(3, "jijj");
		System.out.println(list);
		list.addAll(3, c);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		list.remove(2);
		System.out.println(list);
		System.out.println(list.indexOf("java"));
		System.out.println(list);
		System.out.println(list.lastIndexOf("java"));
		
	}

}
