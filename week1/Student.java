package week1;

public class Student {

	private String sub;
	private String name;
	private String gender;
	private String province;
	
	Student(String sub,String name,String sex,String province){
		super();
		this.sub=sub;
		this.gender=sex;
		this.name=name;
		this.province=province;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Student [sub=" + sub + ", name=" + name + ", sex=" + gender + ", province=" + province + "]";
	}
	
	
}
