package JavaBasic;

import java.util.Scanner;

public class NegativePositveNumber {

	public static void main(String[] args) {
		/*
		  Write a Java program to print whether it is positive or negative ?

Write Code to get number from any variable ?

print whether number is positive or negative
		 */
		
		System.out.println("Enter your Number :");
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num >0) {
			System.out.println(num + " is positive number");
		}else if(num==0){
			System.out.println(num +" is not positive not negative ");
		}else {
			System.out.println(num +" is negative number");
		}
 			
	}

}
