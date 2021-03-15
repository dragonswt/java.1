package week;

import java.util.Scanner;

public class zuoyetwo {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入水仙花的位数：");
		int weishu=scan.nextInt();
		if(weishu<3||weishu>7) {
			System.out.println("error");
		}
		for(int number=(int)Math.pow(10, weishu-1);number<Math.pow(10, weishu);number++) {
			int sum=0;
			int data=number;
			while(data!=0) {
				int wei=data%10;
				sum=(int)(sum+Math.pow(wei, weishu));
				data=data/10;
			}
			if(sum==number) {
			System.out.println(""+number);
			}
			
		}
	}
}
