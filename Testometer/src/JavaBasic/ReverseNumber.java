package JavaBasic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		  Write Code to reverse a number?
suppose a = 346
output should be 643 
		 */
		System.out.println("***Reverse Number***");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num =scan.nextInt();
		int reversed=0;
			while(num != 0) { 
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		      num /= 10;	
			}

	    System.out.println("Reversed Number: " + reversed);
	}
}
