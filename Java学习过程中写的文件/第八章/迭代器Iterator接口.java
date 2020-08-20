package 第八章;

import java.util.Collection;
import java.util.ArrayList;
import java.util.*;

public class 迭代器Iterator接口 {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList();
		Collection r = new ArrayList();
		r.add("afjbal");
		r.add("ljfa");
		c.add("java");
		c.add("jaklsfj");
		c.add("khaflk");
		c.remove("java");
		c.addAll(r);
		c.removeAll(r);
		Iterator it = c.iterator();

		while (it.hasNext()) {
			String d = (String) it.next();
			System.out.println(d);

		}	
						while (it.hasNext()) {
			String i = (String) it.next();
			System.out.println(i);

		}

		if (c.contains("java")) {
			System.out.println("存在Java");
		}
		if (c.containsAll(r)) {
			System.out.println("存在集合r");

		}
				while (it.hasNext()) {
			String d = (String) it.next();
			System.out.println(d);

		}

		c.clear();
		if (c.isEmpty()) {
			System.out.println("c集合已经为空");
		}
		c.add("jlfas");
		System.out.println(c.size());
		Object[] d = c.toArray();
		if (d.getClass().isArray()) {
			System.out.println("c变为数组");
		} /*
			 * public static boolean isArray(Object obj) { if(obj == null) { return false; }
			 * return obj.getClass().isArray(); }检验数组的方法
			 */
		/*
		 *  因为迭代器使用完了,里面也就没有元素了,
		 * 
		 * 2: 并且java语言没有提供重置的方法. 
		 * 
		 * 代码如下
		 * 
		 * import java.util.ArrayList; import java.util.Iterator;  
		 * public class ListDemo {     public static void main(String[] args) {
		 *         ArrayList<Integer> list = new ArrayList<Integer>();
		 *         list.add(5);         list.add(3);         list.add(2);
		 *         Iterator<Integer> it = list.iterator();
		 *         while (it.hasNext()) {             System.out.println(it.next());
		 *         }         System.out.println(it.hasNext());// false 表示没有元素了
		 *         //System.out.println(it.next());//会抛出异常 NoSuchElementException
		 *                   it = list.iterator(); //从集合里重新获得迭代器     } } 拓展思考:
		 * 
		 * 对于此类问题,往往是对java类不太熟悉, 可以经常使用java api文档, 查看文档,你会快速了解到某个类的方法有哪些, 继承了哪些接口等情况,
		 * 
		 * 比如Iterator类的方法说明如下
		 * 
		 * 方法摘要
		 * 
		 * boolean    hasNext()如果仍有元素可以迭代，则返回 true。    
		 * 
		 * E    next()返回迭代的下一个元素。    
		 * 
		 * void    remove()从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。    
		 * 
		 * 
		 */
		/*[Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
		 * 解释：

这个错误是很常见的错误，错误的提示已经很清楚了就是java的Object数组不能转换成为String[]数组，这就说明你要转换的数组它本身是Object类型的数组，但是你却非要把它转换为String类的数组，这当然是错误的。

 解决办法：

在遇到类型转换出错的时候，首先要观察被转换的对象的原来类型是什么，有的时候，一些对象被包装了很多层，这个就需要首先把它转换成为自己本来的类型的对象，然后根据这个对象再去操作里面的元素，再一次的转换类型,而且有的时候被分析的对象可能有多层的包装，在转换的过程中需要多层的解开她，就像白菜一样，一层一层的剥开它本来的类型，直到获取到对象的最终类型，然后把不能再分解的类型转换成为自己目标类型的对象。

 



		 */

	}
}
