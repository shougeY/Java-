package 图书馆系统;

import java.util.Scanner;

public class zhu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		qd q = new qd();
		Book[] z = new Book[2];
		for (int j=0;j<2;j++) {
		String b, d, f, g, h;
		int ch;
		double ji;
		b = sc.next();
		d = sc.next();
			ch = sc.nextInt();	
			f = sc.next();
			ji = sc.nextDouble();
		g = sc.next();
		h = sc.next();
		
		Book a= new Book();
		

		a.setBookname(b);
		a.setBookwriter(d);
		a.setChubannian(ch);
		a.setChubanshe(f);
		a.setJiage(ji);
		a.setISBN(g);
		a.setLeibie(h);
		z[j]=a;}

		SV n = new SV();
		n.setA(z);
		ibook bo = n;
		q.setIb(bo);
		q.xg1();
		for (int i = 0; i < n.getA().length; i++) {
			
				System.out.println(n.getA()[i].getBookname() + '\n' + n.getA()[i].getBookwriter() + '\n' +n.getA()[i].getChubannian() + '\n'
						+ n.getA()[i].getChubanshe() + '\n' + n.getA()[i].getISBN() + '\n' + n.getA()[i].getJiage() + '\n'
						+ n.getA()[i].getLeibie());}
		


				//q.cx1();
		//q.sc1();
		//q.xg1();
	}
		/*for (int i = 0; i < 2; i++) {
			String b, d, f, g, h;
			int ch;
			double ji;
			b = sc.next();
			d = sc.next();
				ch = sc.nextInt();	
				f = sc.next();
				ji = sc.nextDouble();
			g = sc.next();
			h = sc.next();
			
			

			z[i].setBookname(b);
			z[i].setBookwriter(d);
			z[i].setChubannian(ch);
			z[i].setChubanshe(f);
			z[i].setJiage(ji);
			z[i].setISBN(g);
			z[i].setLeibie(h);

		}*/

}
