package 图书馆系统;

public class qd {
	private ibook ib;
	
	public qd() {}
	public qd(ibook ib) {
		this.ib=ib;
	}
	public ibook getIb() {
		return ib;
	}
	public void setIb(ibook ib) {
		this.ib = ib;
	}
	public void zj1() {
		ib.zj();
	};
	public void  cx1() {
		ib.cx();
	};
	public  void sc1() {
		ib.sc();
	};
	public void xg1() {
		ib.xg();
	};
	

}
