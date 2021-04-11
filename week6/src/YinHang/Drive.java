package YinHang;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        CheckingAccount b = new CheckingAccount();
        while (true) {
            b.View();//调用界面函数
            int select = sc.nextInt();
            switch(select) {
            case 1: b.openAccount();//创建账户
                break;
            case 2: b.enter();//登入
                    break;    
            default: System.out.println("选择业务异常，请重新选择");
            break;
            }
            System.out.println("是否继续选择其他业务");
            System.out.println("退出请按   0");
            System.out.println("继续选择其他业务请按  1");
            select = sc.nextInt();
            if (select == 0) {
                break;
            }
        }
 
    }

}
