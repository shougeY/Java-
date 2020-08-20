package 第八章.第八章实验题2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 通讯录 {

	private Map<String, Set> M;

	public 通讯录() {

	}
	public 通讯录(Map<String,Set> z) {
		this.M=z;
	}

	Scanner sc = new Scanner(System.in);

	public void 增加通讯录() {
System.out.println("请输入新增通讯录名称");
		String ca = sc.next();
		Set ba = new TreeSet();
		M.put(ca, ba);

	}

	public void 增加用户() {
		String name, phone, fenzu;
		System.out.println("请输入联系人姓名(quit)");
		name = sc.next();
		System.out.println("输入联系人电话号码");
		phone = sc.next();
		System.out.println("输入联系人分组");
		fenzu = sc.next();
		
		M.get(fenzu).add(new person(name, phone, fenzu));
		System.out.println(M.get(fenzu));

	}
	public void showtxl() {
		Set en=M.entrySet();
		Iterator it =en.iterator();
		System.out.println("通讯录（按名字排序)");
		
		while(it.hasNext()) {
			Entry e=(Entry)it.next();
			String fenzu=(String)e.getKey();
			Set q=(Set)e.getValue();
			Iterator z=q.iterator();
			while(z.hasNext()) {
				person p=(person)z.next();
			System.out.println(p.getName()+" "+p.getPhone()+fenzu);}
			
		}
		
		
	}
	public Map<String, Set> getM() {
		return M;
	}

	public void setM(Map<String, Set> m) {
		M = m;
	}

	public void showfenzutxl() {
		
		System.out.println("输入你想查找的分组");
		String cd=sc.next();
		System.out.println(cd+"组内包含的联系人如下：");
		for(int i=0;i<M.get(cd).size();i++) {
			Iterator it= M.get(cd).iterator();
			while(it.hasNext()) {
				person p=(person)it.next()
						;
				System.out.println(p.getName()+" "+p.getPhone());
			}
			
			
			
		}
		
				
	}

}
