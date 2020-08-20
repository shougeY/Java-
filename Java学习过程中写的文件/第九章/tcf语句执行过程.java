package 第九章;

public class tcf语句执行过程 {
	public static void main(String[] args) {
		try{
			System.out.println("try…");
			if(1==1) return;
			System.out.println(1/0);
		}catch(ArithmeticException ae){
			System.out.println("catch...");
		}finally{
			System.out.println("finally...");
		}
    }
}


