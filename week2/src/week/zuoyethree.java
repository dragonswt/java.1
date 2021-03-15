package week;

import java.util.Scanner;


public class zuoyethree {

	public static void main(String[] args) {
		
		System.out.println("Please input triangle high:");
		Scanner scan=new Scanner(System.in);
		int high=scan.nextInt();
		int i=high-1;
		int p=1;
		while(i>=0&&p<=high) {
			for(int m=0;m<=i;m++) {
				System.out.print(" ");
			}
			for(int n=1;n<=p;n++) {
				System.out.print("* ");
			}
			i--;p++;
			System.out.println("");
		}
		
	}
}
