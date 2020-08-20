package 算法结课;

public class H {
	public  static  void main(String []args) {
		int i=0;
		int [] a=new int [11];
		a[10]=0;
		for (i=9;i>=1;i--) {
			a[i]=2*(a[i+1]+1);
		}
		System.out.println(a[1]);
	}

}
