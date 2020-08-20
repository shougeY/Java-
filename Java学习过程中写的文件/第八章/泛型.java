package 第八章;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class 泛型 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("lajsfd");
		list.add("jlafj");
		list.add("jlasjfd");
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);

		}
		Iterator<String> it = list.iterator();
		
	

	while (it.hasNext())
{String s=it.next();
System.out.println(s);

	
}
}}
