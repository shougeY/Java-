package 第九章;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 使用throw抛出异常 {
	
	public static void main(String[] args) throws ParseException{
		Scanner scn  = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print("输入生日(yyyy-MM-dd):");
		String birthStr = scn.next();
		
		//如果birthStr不可解析, 就抛出异常
		Date birth = sdf.parse(birthStr);
		System.out.println("生日:"+sdf.format(birth)); 
	}
}


