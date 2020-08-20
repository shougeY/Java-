package 第九章.实验题1;

public class 账户 {
	private double  cunkuai;
	private String cname;
	private String id;
	public  账户() {
		
	}
	public  账户 (double a) {
		this.cunkuai=a;
	}
	public double getCunkuai() {
		return cunkuai;
	}
	public void setCunkuai(double cunkuai) {
		this.cunkuai = cunkuai;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
