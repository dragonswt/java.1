package YinHang;

import java.util.Scanner;

public class LoanCreditAccount extends CreditAccount  {

	Scanner sc = new Scanner(System.in);
	 
    public LoanCreditAccount(){}
    public  LoanCreditAccount(int id, String password, String name, String personId,String email, double balance, double ceiling,double overdraft) {
        super(id, password, name, personId, email, balance, ceiling, overdraft);
    }
    public void requestLoan(double money) {//贷款方法
        if ( 0 <= money&& money <= 10000) {//贷款上限为10000
            System.out.println("贷款成功,您的贷款金额为: " + money);
            System.out.println("您还能贷款的金额为: " + (10000 - money));
            super.setCeiling(money);//把贷款的钱传给贷款属性
            super.setBalance(super.getBalance() + money);//更新余额值
            System.out.println("您现在的余额为： " + super.getBalance());
        }else {
            System.out.println("对不起您的额度不够，贷款失败！");
        }
    }
    public void payLoan(double money) {//还款
        //三个判断条件：1. 还款金额小于等于贷款金额    2.还款金额小于所剩余额 3.还款金额大于0
        
        if (super.getBalance() >= money && money <= super.getCeiling() && money >= 0) {
            super.setBalance(super.getBalance() - money); //更新余额
            super.setCeiling(super.getCeiling() - money);
            System.out.println(" 您现在的余额为" + super.getBalance());
            if (super.getCeiling() ==0) {
                System.out.println("您已经全部还清！！谢谢光临!!");
            }else {
                
                System.out.println("您已经还了" + money +"您还需要还" + super.getCeiling()  );
            }
        }else {
            System.out.println("对不起，您的账户余额不足或者输入的还款额度超出范围！");
        }
        
    }
    public void getLoan() {//获取用户贷款总额
        double savSum = 0;
    }

 
}
