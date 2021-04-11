package YinHang;
//银行账户
public class BankAccount {
	private int id;//账户
	private String password;//密码
	private String name;//姓名
	private String persond;//身份证
	private String email;//邮箱
	private double ceiling;
	private static double balance;//余额
	
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
	
	//开户函数
	public BankAccount openAccount() {
		return null;
	}
	
	//开户成功
	public void show() {
		System.out.println("账户IDwei"+id+"密码为"+password+"姓名为"+name+"身份证号为"+persond+"邮箱为"+email);
		
	}
	
	//登录函数
	public void enter() {
		
	}
	
	//取款函数
	public static void dispoint(double money) {
	}
	
	//存款函数
	public static void withpoint(double money) {
		balance=balance+money;
		System.out.println("您已存入"+money+"元，账户余额为"+balance);
	}
	
	
	//基本构造函数
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
