package 第八章.Collections类;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Collections集合工具类 {
	public static void main(String[] args) {

		Set list = new TreeSet( new 比较器());
		list.add(new student("jlajfl", 89));
		list.add(new student("lhfdla", 90));
		list.add(new student("lkjalf", 87));
		Iterator it= list.iterator();
		while(it.hasNext()) {
			student s=(student)it.next();
			System.out.println(s.getName()+s.getXh());
		}

		System.out.println(list);

	}//看书上的Collections；
}
