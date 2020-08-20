package 第八章.map及其实现类;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class map接口 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1", "song");
		map.put("2", "zhang");
		map.put("3", "andrew");
		Collection c = map.values();
		String key;
		Scanner sc = new Scanner(System.in);
		key = sc.next();
		System.out.println(map.get(key));

		System.out.println(c);
		Set set = map.keySet();
		System.out.println(set);
		System.out.println(map.remove(key));
		if (map.isEmpty()) {
			System.out.println("唯恐天下不");

		} else {
			System.out.println(map.size());
		}
		if (map.containsKey(key) && map.containsValue("song")) {
			System.out.println("cunz");
		}
		Collection cp = map.values();
		System.out.println(cp);
		Map m = new HashMap();
		m.put("ljkaf", "alue");
		map.putAll(m);
		System.out.println(map);
		map.clear();

	}

}
