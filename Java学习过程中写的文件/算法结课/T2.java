package 算法结课;

import java.util.Scanner;

public class T2 {
	 public static  void main(String []args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
int i=1,s=1,sum=0;
while(i<=n)
	{
		s *= i;
		s %= 1000000;
		sum += s;
		i++;
	}//这样就不会在求阶乘的和中值溢出
sum%=1000000;
System.out.println(sum);
}}
