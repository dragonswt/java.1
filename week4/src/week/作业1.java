package week;

class Address{
	String Nation,Pro,City,Street,Pos;
	
	public Address(String Nation,String Pro,String City,String Street,String Pos) {
		this.Nation=Nation;
		this.Pro=Pro;
		this.City=City;
		this.Street=Street;
		this.Pos=Pos;
		
	}
	
	public void tell() {
		System.out.println("地址"+this.Nation+this.Pro+this.City+this.Street+"邮编"+this.Pos);
	}

	private String id(String nation2) {
		// TODO Auto-generated method stub
		return null;
	}
}

public class 作业1 {
	public static void main(String args[]) {
		Address add=new Address("中国","湖北省","武汉","阳光大道","40024");
		add.tell();
	}

}
