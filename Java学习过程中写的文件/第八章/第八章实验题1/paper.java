package 第八章.第八章实验题1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class paper {
	private int count;
	private Map<Integer, question> question;

	public paper() {

	}

	public paper(int  c) {
		this.count=c;
question =new HashMap<Integer,question>();
for(int i=0;i<c;i++) {
	this.addquestion(i);
	
	
}
		
	}

	public void addquestion(int x) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入题目描述");
		String title = sc.nextLine();/*
		
		
		
		
		首先，next（）一定要读取到有效字符后才可以结束输入，对输入有效字符之前遇到的空格键、Tab键或Enter键等结束符，next（）方法会自动将其去掉，只有在输入有效字符之后，next（）方法才将其后输入的空格键、Tab键或Enter键等视为分隔符或结束符。简单地说，next（）查找并返回来自此扫描器的下一个完整标记。完整标记的前后是与分隔模式匹配的输入信息，所以next方法不能得到带空格的字符串而nextLine（）方法的结束符只是Enter键，即nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。

鉴于以上两种方法的只要区别，同学们一定要注意next（）方法和nextLine（0方法的连用，下面举个例子来说明：

import java.util.Scanner;public class NextTest 

{

 public static void main(String[] args) 

{  // TODO Auto-generated method stub  String s1,s2;  Scanner sc=new Scanner(System.in);  System.out.print("请输入第一个字符串：");  s1=sc.nextLine();  System.out.print("请输入第二个字符串：");  s2=sc.next();  System.out.println("输入的字符串是："+s1+"  "+s2); }}

运行结果：

请输入第一个字符串：home请输入第二个字符串：work输入的字符串是：home  work

但如果把程序改一下， s1=sc.next(); s2=sc.nextLine();

运行结果是：

请输入第一个字符串：home请输入第二个字符串：输入的字符串是：home 

3
nextLine（）自动读取了被next（）去掉的Enter作为他的结束符，所以没办法给s2从键盘输入值。经过验证，其他的next的方法，如double nextDouble()  ， float nextFloat() ， int nextInt() 等与nextLine（）连用时都存在这个问题，解决的办法是：在每一个 next（）、nextDouble()  、 www.gzlij.com（）、nextFloat()、nextInt() 等语句之后加一个nextLine（）语句，将被next（）去掉的Enter结束符过滤掉

import java.util.Scanner;public class NextTest 

{ String s1,s2; Scanner sc=new Scanner(System.in); System.out.print("请输入第一个字符串："); s1=sc.next(); sc.nextLine(); System.out.print("请输入第二个字符串："); s2=sc.nextLine(); System.out.println("输入的字符串是："+s1+"  "+s2);}

运行结果是：

请输入第一个字符串：home请输入第二个字符串：work输入的字符串是：home  work


		*/
		List<String> list = new ArrayList();
		while (true) {
			System.out.println("请输入选项（quit表示结束");
			String op = sc.nextLine();
			if (op.equalsIgnoreCase("quit")) {
break;
			}
			list.add(op);

		}
		System.out.println("输入题目的答案");
		String an=sc.nextLine()
				;
		question qu= new question (title,list,an);
		question.put(++x,qu);
		

	}

	public void showPaper() {
		System.out.println();
		Set<Integer> s=question.keySet()
				;
		Iterator <Integer>it = s.iterator()
				;
		while(it.hasNext()) {
			int k= it.next();
			System.out.println("第"+k+"题");
			question q =question.get(k);
					q.questionshow();
					
		}
		
		
		
	}
	public Map<Integer,question> getquestion(){
		return question;
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Map<Integer, question> getQuestion() {
		return question;
	}

	public void setQuestion(Map<Integer, question> question) {
		this.question = question;
	}

}
