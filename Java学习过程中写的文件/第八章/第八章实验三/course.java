package 第八章.第八章实验三;

public class course {
	private String name;
	private int score;

	public course() {

	}

	public course(String name,int a) {
		this.name = name;
		this.score=a;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		String a = this.name;
		
		return "课程为"+a+this.score;	}

}
