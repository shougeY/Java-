package 算法结课;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Juzheng {
	static class Juzhen{
		int x;
		int y;
		Juzhen cal(Juzhen another) {
			if(this.y!=another.x)
				return null;
			num+=x*y*another.y;//每次矩阵运算的次数
			return new Juzhen(x,another.y);
		}
		public Juzhen(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	private static int num=0;//Map接口中键和值一一映射. 可以通过键来获取值。

//给定一个键和一个值，你可以将该值存储在一个Map对象. 之后，你可以通过键来访问对应的值。
	private static Map<String,Juzhen> map=new HashMap<String, Juzhen>();
	public static void getNum(String exp) {
		Stack<Juzhen> s=new Stack<Juzhen>();
		int i=0;
		s.add(null);//空栈
		while(i<exp.length()) {
			 if(exp.charAt(i)=='('){//入栈
				s.add(null);
			}else if(exp.charAt(i)==')') {//出栈
				Juzhen p1=s.pop();//移除堆栈顶部的对象，并作为此函数的值返回该对象。
				Juzhen p2=s.pop();
				s.add(p2.cal(p1));
			}else {//字母
					Juzhen t=map.get(exp.charAt(i)+"");//第一步get到A对应的矩阵
					Juzhen p=s.pop();
					if(p!=null)
						s.add(p.cal(t));
					else
						s.add(t);
			}
			i++;
		}
	}
	public static void main(String[] args) {
		map.put("A", new Juzhen(50,10));
		map.put("B", new Juzhen(10,20));
		map.put("C", new Juzhen(20,5));
		
		getNum("A(BC)");
		System.out.println(num);
	}

}
