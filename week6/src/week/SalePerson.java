package week;

public class SalePerson extends Employee{

	public SalePerson(String id, String name, String department, float baseSalary) {
		super(id, name, department, baseSalary);
		// TODO Auto-generated constructor stub
		this.yearlySales=yearlySales;
	}

	
	private float yearlySales;


	public float getYearlySales() {
		return yearlySales;
	}


	public void setYearlySales(float yearlySales) {
		this.yearlySales = yearlySales;
	}
	
	public void updateSalary() {
		super.updateSalary();//��д�Ӹ���̳������ķ���
		super.setBaseSalary(super.getBaseSalary()+this.yearlySales*0.1f);
	}
	public String toString() {
		return "Administrator [yearlySales="+yearlySales+",toString()="+super.toString()+"]";
	}
	

}
