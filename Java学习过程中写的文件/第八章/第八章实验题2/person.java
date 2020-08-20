package 第八章.第八章实验题2;

import java.util.Set;

public class person implements Comparable {
	private String phone;
	private String  name;
	private Set <String> set;
	private String fenzu ;
	public String getFenzu() {
		return fenzu;
	}
	public void setFenzu(String fenzu) {
		this.fenzu = fenzu;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public person() {
		
	}
	public person (String name,String phone,String fenzu) {
		this.name=name;
		this.phone=phone;
		
	this.fenzu=fenzu;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		if (o instanceof person) {
			person s=(person) o;
			return this.name.compareTo(s.name);
		}
		return 0;
	}
	

}
