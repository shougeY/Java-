package 第八章.hashset;
import java.util.Set;
import java.util.HashSet;
public class SetlDom {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new student("Lucy",20));
		set.add(new student("Hellen",19));
		set.add(new student("Andrew",21));
		set.add(new student("Andrew",19));	//没有与之完全相同的对象，存储
		set.add(new student("Andrew",21));	//该对象已存在，被舍弃

		for(Object obj: set){
			student stu = (student)obj;
			System.out.println(stu.getName()+","+stu.getAge());
		}
	}

}



