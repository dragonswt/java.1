package week;

import java.util.Scanner;

public class ��ҵ2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum1=0,sum2=0,sum3=0;//ż���ͣ�ÿ��������������
		System.out.println("��������������FirstNum��SecondNum(FirstNumҪ��SecondNumС):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>=b) {
			System.out.println("�������������������������������롣");
			
		}
		else {
			
			int i=a+1;
			while(i<b) {
				if(i%2==0) {
					sum1=sum1+i;
					sum2=sum2+(i+1);
					System.out.print("������");
					System.out.print(+(i+1));
					sum3=sum3+((i+1)*(i+1));
					i=i+2;
				}
				else {
					sum1=sum1+(i+1);
					sum2=sum2+i;
					System.out.print("������");
					System.out.println(+i);
					sum3=sum3+i*i;
					i=i+2;
				}
			}
			System.out.println("ż����="+sum1);
			System.out.println("������="+sum2);
			System.out.println("����ƽ����="+sum3);
			int p=a+1;
			System.out.print("ÿλ���ֵ�ASCII�룺");
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
