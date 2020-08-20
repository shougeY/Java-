package 第八章.treeset;
	import java.util.Iterator;
	import java.util.Set;
	import java.util.TreeSet;
	public class TreeSetDom2 {
		public static void main(String[] args) {
			Set set = new TreeSet();
			set.add(new student("Lucy",20));
			set.add(new student("Hellen",21));	
			set.add(new student("Andrew",19));
	
			set.add(new student("Andrew",20)); //对象相同，被舍弃
			//用迭代器输出集合中的元素
			Iterator it = set.iterator();
			while(it.hasNext()){
				student stu = (student)it.next();
				System.out.println(stu.getName()+","+stu.getAge());	
			}				
		}
	}


