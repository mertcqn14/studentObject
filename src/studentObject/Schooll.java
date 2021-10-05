package studentObject;

public class Schooll {
	private String name;
	private String addres;
	private String phone;
	public Schooll(String name, String addres, String phone) {
		super();
		this.name = name;
		this.addres = addres;
		this.phone = phone;
	}
	public Schooll() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	
	Schooll okul=new Schooll("ÝBMTAL","TABAKLAR","0434646");
	System.out.println(okul.getName());
	
	
	}
	
   
 }
