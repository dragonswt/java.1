package YinHang;

import java.util.Scanner;

//�˻�����


public class CheckingAccount{
	int i;//�˻����
	private BankAccount[] account=new BankAccount[100];//�˻���������
	private int accountNum=0;//�˻�����
	private int type;//����
	private String passwords;//ȷ������
	int id=100000;//first Account
	int j=1;//����Ϊ1
	Scanner scan=new Scanner(System.in);
	int inster;
	
	public CheckingAccount() {
		
	}
	
	//ѡ�����
	public void View() {
		System.out.println("***��ѡ��ҵ��***********************");
		System.out.println("***1.���ÿ� checkingAccount*********");
		System.out.println("***2.�洢�� savingAccount***********");
		System.out.println("***3.���� exit**********************");
		System.out.println("***������ѡ��1-3����**************");
	}
	
	//��������
	public void select() {
		int select=scan.nextInt();
		switch(select) {
		case 1: this.openAccount();break;
		case 2: this.enter();break;
		case 3:break;
		}
	}
	
	//��������
	public BankAccount openAccount() {
		System.out.println("��������������:");
		String name=scan.next();
		
		//System.out.println("���������Ŀ���");
		//int id=scan.nextInt();
		
		System.out.println("��������������:");
		String password=scan.next();
		System.out.println("��ȷ����������:");
		String passwords=scan.next();
		
		while(!passwords.equals(passwords)) {
		System.out.println("�Բ���������������벻һ�£�����������!");
		System.out.println("�����ٴ�������������");
		password=scan.next();
		System.out.println("���ٴ�ȷ����������");
		passwords=scan.next();
		}
		
		System.out.println("�������������֤��");
		String persond=scan.next();
		
		System.out.println("��������������");
		String email=scan.next();
		
		System.out.println("�����������˻�����");
		System.out.println("1.���     2.���ÿ�");
		
		type=scan.nextInt();
		switch(type) {
		case 1:
			account[accountNum]=new LoanCreditAccount(100000+j,password,name,persond,email,0,0, accountNum);
			account[accountNum].show();
			System.out.println("������Ϊ���洢��");
			j++;
			return account[accountNum];
		case 2:
			account[accountNum] = new LoanCreditAccount(100000+j,password,name,persond,email,0,0,5000);
			account[accountNum].show();
			System.out.println("������Ϊ�����ÿ�");
			accountNum++;
			j++;
			return account[accountNum];
		}
		return null;
		
	}
	
	//��¼����
	public BankAccount enter() {
		System.out.println("�������������п���");
		int id=scan.nextInt();
		System.out.println("��������������");
		String password=scan.next();
		
		if(accountNum==0) {
			System.out.println("δע���˻�������ע�ᣡ");
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
			System.out.println("��¼ʧ�ܣ�����");
		}
		if(flag) {
			System.out.println("��¼�ɹ�������");
			do {
				System.out.println("��ѡ��ҵ��");
				System.out.println("*******1.���*******");
				System.out.println("*******2.ȡ��*******");
				System.out.println("*******3.����*******");
				System.out.println("*******4.����*******");
				System.out.println("*******5.��������˳�*******");
				inster=scan.nextInt();
				switch(inster) {
				case 1:
					System.out.println("*******����������*******");
				    double money=scan.nextDouble();
				    account[i].withpoint(money);
				    break;
				case 2:
					System.out.println("*******������ȡ����*******");
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
	
	
	//����
	public void withpoint() {
		System.out.println("����������");
		int money = scan.nextInt();
		account[i].withpoint(money);
	}
	//ȡ���
	public void dispoint() {
		System.out.println("������ȡ����");
		int money = scan.nextInt();
		account[i].dispoint(money);
	}
	//����
	public void Accountsum() {
		double savSum = 0;
		for(int i=0;i<accountNum;i++) {
			savSum += account[i].getBalance();
		}
	}
	
    //�ж���LoanSavingAccount �໹��LoacCreditAccount
    //�����
    public void judge() {
        System.out.println("******�����������*****************");
        int money = scan.nextInt();
        if (account[accountNum - 1] instanceof LoanSavingAccount) {
            LoanSavingAccount a = (LoanSavingAccount) account[accountNum - 1];
            a.requestLoan(money);
        }else {
            LoanCreditAccount b = (LoanCreditAccount) account[accountNum -1];
            b.requestLoan(money);
            System.out.println("�ɹ������˴����");
        }
 
    }
 
    //�����
    public void repay() {
        System.out.println("******�����뻹����*****************");
        int money = scan.nextInt();
        if (account[accountNum - 1] instanceof LoanSavingAccount) {
//            System.out.println("�жϹ���1");
            LoanSavingAccount a = (LoanSavingAccount) account[accountNum - 1];
            a.payLoan(money);
        }else {
//            System.out.println("�жϹ���2");
            LoanCreditAccount b1 = (LoanCreditAccount) account[accountNum - 1];
            b1.payLoan(money);
        }
 
    }

}
