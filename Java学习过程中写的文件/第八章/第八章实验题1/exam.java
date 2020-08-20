package 第八章.第八章实验题1;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exam {
	private student s;
	private paper p;
	private answersheet an;

	public exam() {

	}

	public exam(student s) {
		this.s = s;

	}

	private void createPaper() {
		System.out.println("输入题目个数");
		Scanner sc = new Scanner(System.in);
		try {
			int c = sc.nextInt();
			p = new paper(c);
			p.showPaper();

		} catch (InputMismatchException e) {
			System.out.println("题号必须是数字，程序结束");
		}

	}

	private void ljafl() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		an = new answersheet();
		for (int i = 0; i < p.getCount();) {
			System.out.println("输入要答题的题号");
			int key = sc.nextInt();
			if (key >= 1 && key <= p.getCount()) {
				System.out.println("输入答案");
				String answer = sc.next();
				an.addanswer(key, answer);
				i++;

			} else {
				System.out.println("没有这道题！");

			}

		}
	}
	private void showScoreofpaper() {
		System.out.println("\n考生"+s.getName());
		int right =0;
		Set<Integer> se=p.getquestion().keySet();
		Iterator<Integer> it =se.iterator()
				;
		while(it.hasNext()) {
			int kk=it.next()
					;
			System.out.println("第"+kk+"题");
			String answe1=p.getquestion().get(kk).getAnswer()
					;
			System.out.println("标准答案"+answe1+"\t");
			String answe2=an.getanswer().get(kk);
			System.out.println("用户答案"+answe2);
			if (answe1.equalsIgnoreCase(answe2)) {
				right++;
				
			}
		}
		System.out.println("共答对"+right +"道题目");
	}
	public void exam() {
		createPaper();
		ljafl() ;
		showScoreofpaper() ;
	}

}
