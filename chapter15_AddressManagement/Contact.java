package chapter15_AddressManagement;

public class Contact {
	private String name;
	private String email;
	private String phone;
	private String addr;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String email, String phone, String addr) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str;
		str = "name: " + name + ", email: " + email + ", phone: " + phone + ", addr: " + addr;
		return str;
	}
	
	
}
