package YinHang;

import java.util.Scanner;

//账户操作


public class CheckingAccount{
	int i;//账户编号
	private BankAccount[] account=new BankAccount[100];//账户对象数组
	private int accountNum=0;//账户数量
	private int type;//类型
	private String passwords;//确认密码
	int id=100000;//first Account
	int j=1;//变量为1
	Scanner scan=new Scanner(System.in);
	int inster;
	
	public CheckingAccount() {
		
	}
	
	//选项界面
	public void View() {
		System.out.println("***请选择业务***********************");
		System.out.println("***1.信用卡 checkingAccount*********");
		System.out.println("***2.存储卡 savingAccount***********");
		System.out.println("***3.返回 exit**********************");
		System.out.println("***请依次选择（1-3）：**************");
	}
	
	//操作函数
	public void select() {
		int select=scan.nextInt();
		switch(select) {
		case 1: this.openAccount();break;
		case 2: this.enter();break;
		case 3:break;
		}
	}
	
	//开户函数
	public BankAccount openAccount() {
		System.out.println("请输入您的姓名:");
		String name=scan.next();
		
		//System.out.println("请输入您的卡号");
		//int id=scan.nextInt();
		
		System.out.println("请输入您的密码:");
		String password=scan.next();
		System.out.println("请确认您的密码:");
		String passwords=scan.next();
		
		while(!passwords.equals(passwords)) {
		System.out.println("对不起！两次输入的密码不一致，请重新输入!");
		System.out.println("请您再次输入您的密码");
		password=scan.next();
		System.out.println("请再次确认您的密码");
		passwords=scan.next();
		}
		
		System.out.println("请输入您的身份证号");
		String persond=scan.next();
		
		System.out.println("请输入您的邮箱");
		String email=scan.next();
		
		System.out.println("请输入您的账户类型");
		System.out.println("1.储蓄卡     2.信用卡");
		
		type=scan.nextInt();
		switch(type) {
		case 1:
			account[accountNum]=new LoanCreditAccount(100000+j,password,name,persond,email,0,0, accountNum);
			account[accountNum].show();
			System.out.println("卡类型为：存储卡");
			j++;
			return account[accountNum];
		case 2:
			account[accountNum] = new LoanCreditAccount(100000+j,password,name,persond,email,0,0,5000);
			account[accountNum].show();
			System.out.println("卡类型为：信用卡");
			accountNum++;
			j++;
			return account[accountNum];
		}
		return null;
		
	}
	
	//登录函数
	public BankAccount enter() {
		System.out.println("请输入您的银行卡号");
		int id=scan.nextInt();
		System.out.println("请输入您的密码");
		String password=scan.next();
		
		if(accountNum==0) {
			System.out.println("未注册账户，请先注册！");
			this.openAccount();
			this.View();
			this.select();
		}
		boolean flag = false;
		for(i=0;i<accountNum;i++) {
			if(id==account[i].getId() && password.equals(account[i].getPassword())) {
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("登录失败！！！");
		}
		if(flag) {
			System.out.println("登录成功！！！");
			do {
				System.out.println("请选择业务");
				System.out.println("*******1.存款*******");
				System.out.println("*******2.取款*******");
				System.out.println("*******3.贷款*******");
				System.out.println("*******4.还款*******");
				System.out.println("*******5.按任意键退出*******");
				inster=scan.nextInt();
				switch(inster) {
				case 1:
					System.out.println("*******请输入存款金额*******");
				    double money=scan.nextDouble();
				    account[i].withpoint(money);
				    break;
				case 2:
					System.out.println("*******请输入取款金额*******");
					money=scan.nextInt();
					account[i].dispoint(money);
					break;
				case 3:   judge();   break;
				case 4:	  repay();   break;
				}
			}while(inster == 1 || inster == 2 || inster == 3 || inster == 4);
		}
		return account[i];
	}
	
	
	//存款函数
	public void withpoint() {
		System.out.println("请输入存款金额");
		int money = scan.nextInt();
		account[i].withpoint(money);
	}
	//取款函数
	public void dispoint() {
		System.out.println("请输入取款金额");
		int money = scan.nextInt();
		account[i].dispoint(money);
	}
	//余额函数
	public void Accountsum() {
		double savSum = 0;
		for(int i=0;i<accountNum;i++) {
			savSum += account[i].getBalance();
		}
	}
	
    //判断是LoanSavingAccount 类还是LoacCreditAccount
    //贷款方法
    public void judge() {
        System.out.println("******请输入贷款金额*****************");
        int money = scan.nextInt();
        if (account[accountNum - 1] instanceof LoanSavingAccount) {
            LoanSavingAccount a = (LoanSavingAccount) account[accountNum - 1];
            a.requestLoan(money);
        }else {
            LoanCreditAccount b = (LoanCreditAccount) account[accountNum -1];
            b.requestLoan(money);
            System.out.println("成功调用了贷款方法");
        }
 
    }
 
    //还款方法
    public void repay() {
        System.out.println("******请输入还款金额*****************");
        int money = scan.nextInt();
        if (account[accountNum - 1] instanceof LoanSavingAccount) {
//            System.out.println("判断过了1");
            LoanSavingAccount a = (LoanSavingAccount) account[accountNum - 1];
            a.payLoan(money);
        }else {
//            System.out.println("判断过了2");
            LoanCreditAccount b1 = (LoanCreditAccount) account[accountNum - 1];
            b1.payLoan(money);
        }
 
    }

}
