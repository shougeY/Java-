package 第八章.Collections类;

import java.util.Comparator;



public class 比较器 implements Comparator{

	
	@Override
	public int compare(Object o1, Object o2) {
	
		if (o1 instanceof student  && o2 instanceof student ) {
			student  a=(student)o1;
			student  b=(student)o2;
			if (a instanceof student&& b instanceof student) {
				return a.getXh()-b.getXh()
						;
			}
			
			
			
		}
		return 0;
	}

}
