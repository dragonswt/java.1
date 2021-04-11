package YinHang;

public class CreditAccount extends BankAccount {

	private double overdraft;//透资属性
    
    public CreditAccount() {}
 
    public CreditAccount(int id, String password, String name, String personId,String email, double balance, double ceiling, double overdraft) {
        super(id,password,name, personId, email, balance, ceiling);
        this.overdraft = overdraft;//多出一个透资属性
    }
    
    //    public void withdraw(double money) {
    //        super.setBalance(super.getBalance() + money);
    //        System.out.println("你的卡号为" + super.getId() +"的卡，您已经存入" + money + "元,账户余额为" + super.getBalance() );
    //    }
    public void deposit(double money) {//信用卡取款方法
        if ((super.getBalance() + overdraft) >= money) {
             super.setBalance(super.getBalance() - money) ;
             System.out.println("您取了" + money + "钱,您的余额为" + super.getBalance());
        }else System.out.println("对不起您的余额和透支额度不足！");
        
        
    }
 
//    @Override
//    public void requestLoan() {
//        // TODO Auto-generated method stub
//        
//    }
    
    

}


//public class General {
//
//    	void requestLoan(double money);//贷款方法
//        void payLoan(double money);//还款
////        void getLoan();//获取用户总额
//    }


