package YinHang;

public class CreditAccount extends BankAccount {

	private double overdraft;//͸������
    
    public CreditAccount() {}
 
    public CreditAccount(int id, String password, String name, String personId,String email, double balance, double ceiling, double overdraft) {
        super(id,password,name, personId, email, balance, ceiling);
        this.overdraft = overdraft;//���һ��͸������
    }
    
    //    public void withdraw(double money) {
    //        super.setBalance(super.getBalance() + money);
    //        System.out.println("��Ŀ���Ϊ" + super.getId() +"�Ŀ������Ѿ�����" + money + "Ԫ,�˻����Ϊ" + super.getBalance() );
    //    }
    public void deposit(double money) {//���ÿ�ȡ���
        if ((super.getBalance() + overdraft) >= money) {
             super.setBalance(super.getBalance() - money) ;
             System.out.println("��ȡ��" + money + "Ǯ,�������Ϊ" + super.getBalance());
        }else System.out.println("�Բ�����������͸֧��Ȳ��㣡");
        
        
    }
 
//    @Override
//    public void requestLoan() {
//        // TODO Auto-generated method stub
//        
//    }
    
    

}


//public class General {
//
//    	void requestLoan(double money);//�����
//        void payLoan(double money);//����
////        void getLoan();//��ȡ�û��ܶ�
//    }


