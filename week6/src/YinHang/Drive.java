package YinHang;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        CheckingAccount b = new CheckingAccount();
        while (true) {
            b.View();//���ý��溯��
            int select = sc.nextInt();
            switch(select) {
            case 1: b.openAccount();//�����˻�
                break;
            case 2: b.enter();//����
                    break;    
            default: System.out.println("ѡ��ҵ���쳣��������ѡ��");
            break;
            }
            System.out.println("�Ƿ����ѡ������ҵ��");
            System.out.println("�˳��밴   0");
            System.out.println("����ѡ������ҵ���밴  1");
            select = sc.nextInt();
            if (select == 0) {
                break;
            }
        }
 
    }

}
