package week;

class Dog{
	private String name,color,age;
	
	public Dog(String name,String color,String age) {
		this.setname(name);
		this.setcolor(color);
		this.setage(age);
	}
	public void tell() {
		System.out.println("����: "+getname()+"��ɫ: "+getcolor()+"����: "+getage());
	}
	public void setname(String n) {
		name=n;
	}
	public String getname() {
		return name;
	}
	public void setcolor(String c) {
		color=c;
	}
	public String getcolor() {
		return color;
	}
	public void setage(String a) {
		age=a;
	}
	public String getage() {
		return age;
	}
}

public class ��ҵ2 {
	public static void main(String args[]) {
		Dog dog=new Dog("ղķ˹	","��ɫ	","9");
		dog.tell();
		
	}

}
