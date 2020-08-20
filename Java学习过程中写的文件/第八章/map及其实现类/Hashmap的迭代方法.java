package 第八章.map及其实现类;

import java.util.*;
import java.util.Map.Entry;
import java.util.Iterator;

public class Hashmap的迭代方法 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1", "song");
		map.put("2", "zhang");
		map.put("3", "andrew");

		Set key = map.keySet();
		Iterator it = key.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
			Set entrySet = map.entrySet();
			Iterator i = entrySet.iterator();//迭代器一一对应;
			while (i.hasNext()) {
				Entry entry = (Entry) i.next();
				String ki=(String)entry.getKey()
						;String st=(String)entry.getValue()
						;
						System.out.println(ki+st);

			}

		}
	}

}
