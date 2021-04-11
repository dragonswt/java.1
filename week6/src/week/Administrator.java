package week;

public class Administrator extends Employee {

	private float bonus;
	
	public Administrator(String id, String name, String department, float baseSalary) {
		super(id, name, department, baseSalary);
		// TODO Auto-generated constructor stub
		this.bonus=bonus;
	}
	
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public void updateSalary() {
		super.updateSalary();//��д�Ӹ���̳������ķ���
		super.setBaseSalary(super.getBaseSalary()+this.bonus);
	}
	public String toString() {
		return "Administrator [bonus="+bonus+",toString()="+super.toString()+"]";
	}
	

	
}
