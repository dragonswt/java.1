package week;

public class Driver {

	public static void main(String[] args) {
		Administrator admin=new Administrator("001","tom","董事长",4000f);
		SalePerson sp=new SalePerson("002","lily","销售",5000f);
		
		System.out.println(admin.toString());
		System.out.println(sp.toString());
		
		admin.updateSalary();
		System.out.println(admin.getBaseSalary());
		sp.updateSalary();
		System.out.println(sp.getBaseSalary());
	}
}
