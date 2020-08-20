package 第八章;

import java.util.ArrayList;
import java.util.List;

public class ArrsyList的底层 {
	public static void main(String[] args) {
		String s = "l;ajf";
		List list = new ArrayList(100000);
		long b = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			list.add(s);

		}
long e=System.currentTimeMillis();
System.out.println(e-b);
((ArrayList) list).trimToSize();
System.out.println(list.size());

	}

}
