package JavaBasic;

import java.util.Scanner;

public class SumAllDigit {

	public static void main(String[] args) {
		/*
		  Write Code Sum all digit a value?
			suppose value a = 234
			sum = 2+3+4 = 9
			sum should be 9 
		 */

		System.out.println("Sum All digit Value");
		System.out.println("Enter your value:");
		Scanner scan= new Scanner(System.in);
		int val= scan.nextInt();
		int sum=0;
		while(val!=0) {
			int digit=val%10;
			sum+=digit;
			val/=10;
		}
		System.out.println("Sum of all digit = " +sum);
	

 }
}

