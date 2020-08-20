package 第八章.第八章实验题1;

import java.util.HashMap;
import java.util.Map;

public class answersheet {
	private Map<Integer,String> ans;
	public answersheet() {
		ans =new HashMap<Integer,String>();
		
	}
	public void addanswer(int k,String answer) {
		ans.put(k, answer);
	}
	public Map<Integer,String> getanswer(){
		return ans;
	}
	

}
