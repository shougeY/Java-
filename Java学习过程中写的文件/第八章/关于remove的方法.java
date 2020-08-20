package 第八章;

import java.util.ArrayList;
import java.util.*;

public class 关于remove的方法 {
	public static void main(String args[]) {
		Collection c = new ArrayList();
		c.add("jajfa;");
		c.add(";ja baj;b");
		c.add("jaflkj");
		Iterator i = c.iterator();
		while (i.hasNext()) {
			String e = (String) i.next();
			System.out.println(e);
			if (e.equals("jajfa;")) {
				/*
				 * 
				 * c.remove(e);
				 * 此方法错误。collection与list定义的remove方法与迭代器本身的管理不同步
				 * */
				i.remove();


			}
		}

	}
}
