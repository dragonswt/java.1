package YinHang;
//�����˻�
public class BankAccount {
	private int id;//�˻�
	private String password;//����
	private String name;//����
	private String persond;//���֤
	private String email;//����
	private double ceiling;
	private static double balance;//���
	
	public BankAccount() {};
	public BankAccount(int id, String password, String name,String persond,String email,double ceiling,double balance) {
		super();
		this.id=id;
		this.password=password;
		this.name=name;
		this.persond=persond;
		this.email=email;
		this.balance=balance;
		this.ceiling=ceiling;
	}
	
	public BankAccount(int id, String password, String name,String persond,String email) {
		super();
		this.id=id;
		this.password=password;
		this.name=name;
		this.persond=persond;
		this.email=email;
	}
	
	public BankAccount(int id,String password){
		this.id=id;
		this.password=password;
	}
	
	//��������
	public BankAccount openAccount() {
		return null;
	}
	
	//�����ɹ�
	public void show() {
		System.out.println("�˻�IDwei"+id+"����Ϊ"+password+"����Ϊ"+name+"���֤��Ϊ"+persond+"����Ϊ"+email);
		
	}
	
	//��¼����
	public void enter() {
		
	}
	
	//ȡ���
	public static void dispoint(double money) {
	}
	
	//����
	public static void withpoint(double money) {
		balance=balance+money;
		System.out.println("���Ѵ���"+money+"Ԫ���˻����Ϊ"+balance);
	}
	
	
	//�������캯��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersond() {
		return persond;
	}
	public void setPersond(String persond) {
		this.persond = persond;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static double getBalance() {
		return balance;
	}
	public static void setBalance(double balance) {
		BankAccount.balance = balance;
	}
	public double getCeiling() {
		return ceiling;
	}
	public void setCeiling(double ceiling) {
		this.ceiling = ceiling;
	}
	
	

	
}
