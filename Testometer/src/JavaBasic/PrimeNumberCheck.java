package JavaBasic;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		/*
		  Write Code to check whether Number is Prime Number or not?

Take one int and check whether number is prime or not

		 */
		
		System.out.println("!!!!!Prime number check!!!!!");
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		boolean prime= true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}

		if(prime==true) {
			System.out.println( num + " is a prime number");
		}
		else {
			System.out.println(num +" is not prime number");
		}
	}  
 
}


