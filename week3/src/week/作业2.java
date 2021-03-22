package week;

import java.util.Scanner;

public class 作业2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum1=0,sum2=0,sum3=0;//偶数和，每个奇数，奇数和
		System.out.println("请输入两个整数FirstNum和SecondNum(FirstNum要比SecondNum小):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>=b) {
			System.out.println("输入两个数不符合条件，请重新输入。");
			
		}
		else {
			
			int i=a+1;
			while(i<b) {
				if(i%2==0) {
					sum1=sum1+i;
					sum2=sum2+(i+1);
					System.out.print("奇数：");
					System.out.print(+(i+1));
					sum3=sum3+((i+1)*(i+1));
					i=i+2;
				}
				else {
					sum1=sum1+(i+1);
					sum2=sum2+i;
					System.out.print("奇数：");
					System.out.println(+i);
					sum3=sum3+i*i;
					i=i+2;
				}
			}
			System.out.println("偶数和="+sum1);
			System.out.println("奇数和="+sum2);
			System.out.println("奇数平方和="+sum3);
			int p=a+1;
			System.out.print("每位数字的ASCII码：");
			while(p<b) {
				
				System.out.print(p+"	");
				p++;
			}
			System.out.println();
			int q=1;
			while(q<=10) {
				System.out.print(+q);
				System.out.println("	"+q*q);
				q++;
			}
		}
		
		
		
	}
}
