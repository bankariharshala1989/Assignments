package JavaBasic;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		/*  Take three numbers from the user and print the greatest number ?

		Suppose you have 3 number

		eg. 10, 34, 12


		You have to write code to find maximum number

		 */
				System.out.println("Enter your First Number :");
				Scanner scan = new Scanner(System.in);
				int a = scan.nextInt();
				System.out.println("Enter your Second Number :");
				int b= scan.nextInt();
				System.out.println("Enter your Third Number :");
				int c= scan.nextInt();
				
				if(a>=b && a>=c) {
					System.out.println(a+ " is a gretest number");
				}else if(b>=a && b>=c) {
					System.out.println(b + " is a gretest number");
				}else {
					System.out.println(c+ " is a gretest number");
				}
					
			}

	}


