package week;

import java.util.Scanner;

public class lianxi {

	public static void main(String args[]) {
		int randomNumber;
		int i=1;
		randomNumber=1+(int)(Math.random()*1000);
		
		
		System.out.println("I have a number 0 to 1000.");
		System.out.println("would you want Guess?");
		System.out.println("Please write your guess:");
		
		Scanner scan=new Scanner(System.in);
		int myGuess=scan.nextInt();
		
		
	
		while(myGuess!=randomNumber && i<=10) {
		
			if(myGuess>randomNumber) {
				System.out.println("HIGH");
			}
			else {
				System.out.println("LOW");
			}
			myGuess=scan.nextInt();
			i++;
			if(i==11) {
				System.out.println("Game over");
				break;
			}
		}
		System.out.println("Beautiful!You are right£¡");
		
		System.out.println("Would you want play again(y/n):");
		
	}
}
