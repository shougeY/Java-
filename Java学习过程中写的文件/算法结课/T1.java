package 算法结课;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int S = 0;
		int s = 1;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			s *= i;
			System.out.println(s);

			S += s;

		}
		System.out.println(S);
		if (S >= 1000000) {

			S = S % 1000000;
			System.out.println(S);

		} else {
			System.out.println("没有余数");
		}

	}
}
