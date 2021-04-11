package YinHang;

import java.util.Scanner;

public class LoanSavingAccount extends CreditAccount{

	Scanner sc = new Scanner(System.in);
	 
	 
    public LoanSavingAccount(int id, String password, String name,
            String personId, String email, double balance, double ceiling) {
        super(id, password, name, personId, email, balance, ceiling, ceiling);
        
    }
    public void requestLoan(double money) {//�����
        if ( 0 <= money&& money <= 10000) {//��������Ϊ10000
            System.out.println("����ɹ�,���Ĵ�����Ϊ: " + money);
            System.out.println("�����ܴ���Ľ��Ϊ: " + (10000 - money));
            super.setCeiling(money);//�Ѵ����Ǯ������������
            super.setBalance(super.getBalance() + money);//�������ֵ
            System.out.println("�����ڵ����Ϊ�� " + super.getBalance());
        }else {
            System.out.println("�Բ������Ķ�Ȳ���������ʧ�ܣ�");
        }
    }
    public void payLoan(double money) {//����
        //�����ж�������1. ������С�ڵ��ڴ�����    2.������С����ʣ��� 3.���������0
        
        if (super.getBalance() >= money && money <= super.getCeiling() && money >= 0) {
            super.setBalance(super.getBalance() - money); //�������
            super.setCeiling(super.getCeiling() - money);
            System.out.println(" �����ڵ����Ϊ" + super.getBalance());
            if (super.getCeiling() ==0) {
                System.out.println("���Ѿ�ȫ�����壡��лл����!!");
            }else {
                
                System.out.println("���Ѿ�����" + money +"������Ҫ��" + super.getCeiling()  );
            }
        }else {
            System.out.println("�Բ��������˻������������Ļ����ȳ�����Χ��");
        }
        
    }
}
