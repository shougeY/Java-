package 第八章.第八章实验题1;

import java.util.*;

public class question {
	private String title;
	private List<String> options;
	private String answer;

	public question() {

	}

	public question(String t, List<String> op, String an) {
		this.answer = an;
		this.options = op;
		this.title = t;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public void questionshow() {
		System.out.println("题目" + title);
		Iterator<String> it = options.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "     ");

		}
	}
	
	

}
