package 图书馆系统;

import java.util.Scanner;

public class SV implements ibook {
	private Book[] a;
	Scanner sc = new Scanner(System.in);

	public Book[] getA() {
		return a;
	}

	public void setA(Book[] a) {
		this.a = a;
	}

	@Override
	public void zj() {
		int c = this.a.length;
		String b, d,  f, g, h;
		int ch;
		double ji;
		b = sc.next();
		d = sc.next();
			ch = sc.nextInt();	
			f = sc.next();
			ji = sc.nextDouble();
		g = sc.next();
		h = sc.next();
		int boi = c + 1;
		Book ac = new Book();
		ac.setBookname(b);
		ac.setBookwriter(d);
		ac.setChubannian(ch);
		ac.setChubanshe(f);
		ac.setJiage(ji);
		ac.setISBN(g);
		ac.setLeibie(h);

		Book[] bo = new Book[boi];
		bo[c] = ac;

		for (int i = 0; i < a.length; i++) {
			bo[i] = a[i];

		}
		this.setA(bo);

	}

	// TODO 自动生成的方法存根

	@Override
	public void cx() {
		int c = this.a.length;
		String b;
		b = sc.next();int z=0;
		for (int i = 0; i < a.length; i++) {
			if (b.equals(a[i].getBookname()) || b.equals(a[i].getISBN())) {
				System.out.println(a[i].getBookname() + '\n' + a[i].getBookwriter() + '\n' + a[i].getChubannian() + '\n'
						+ a[i].getChubanshe() + '\n' + a[i].getISBN() + '\n' + a[i].getJiage() + '\n'
						+ a[i].getLeibie());z=1;

			} 
			if(z==0) {
				System.out.println("不存在此书");
			}
		}
	}

	@Override
	public void sc() {

		int c = this.a.length;
		String b;
		b = sc.next();
		Book[] ch = new Book[c - 1];
		int z = 0;
		for (int i = 0; i < a.length; i++) {
			if (b.equals(a[i].getISBN())) {
				z = i;
			}
		}
		for (int i = 0; i < z; i++) {
			ch[i] = a[i];
		}
		for (int i = z; i < c - 1; i++) {
			ch[i] = a[i + 1];
		}
		this.setA(ch);
	}

	@Override
	public void xg() {
		int z = 0;
		String b;
		b = sc.next();
		for (int i = 0; i < a.length; i++) {
			if (b.equals(a[i].getISBN())) {
				z = i;
			}
		}
		int r = 0;
		System.out.println("修改书名，ISBN号，作者，出版社，出版年，价格，类别，请输入1，2，3，4，5，6，7");
		r = sc.nextInt();
		switch (r) {
		case 1:
			String d = sc.next();
			a[z].setBookname(d);
			break;
		case 2:
			String da = sc.next();
			a[z].setISBN(da);
			break;

		case 3:
			String dac = sc.next();
			a[z].setBookwriter(dac);
			break;
		case 4:
			String dacd = sc.next();
			a[z].setChubanshe(dacd);
			break;
		case 5:
			int de = sc.nextInt();
			a[z].setChubannian(de);
			break;
		case 6:
			double dze = sc.nextDouble();
			a[z].setJiage(dze);
			break;
		case 7:
			String dfafa = sc.next();
			a[z].setLeibie(dfafa);
			break;

		}

	}
}
