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
		System.out.println("��ַ"+this.Nation+this.Pro+this.City+this.Street+"�ʱ�"+this.Pos);
	}

	private String id(String nation2) {
		// TODO Auto-generated method stub
		return null;
	}
}

public class ��ҵ1 {
	public static void main(String args[]) {
		Address add=new Address("�й�","����ʡ","�人","������","40024");
		add.tell();
	}

}
