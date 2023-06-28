package JavaBasic;

import java.util.Scanner;

public class DivisibleThreeFive {

	public static void main(String[] args) {
		
		/*
		  program to print numbers between 1 to 100 which are divisible by 3, 5 and by both
Write a program to print numbers between 1 to 100 which are divisible by 3, 5 and by both

Sample Output: Divided by 3:                                                          
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 
63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
  
Divided by 5:                                                          
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95,                                                                    

                                                                       
Divided by 3 & 5:                                                      
15, 30, 45, 60, 75, 90,

 */

int num=1;
System.out.println(" Enter option number");
System.out.println("1.Numbers ivided by 3");
System.out.println("2.Numbers ivided by 5");
System.out.println("3.Divisible by 3 & 5");

Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
switch (n) {
case 1:
		System.out.println("Divided by 3: ");
		do{
	
			if(num%3==0) {
				System.out.print(num + ", ");
			}
			num++;
			}while(num<=100);
		break;
case 2:		
		System.out.println("Divided by 5: ");
		do{
	
			if(num%5==0) {
				System.out.print(num + ", ");			
			}
			num++;
		}while(num<=100);
		break;
case 3:
		
		System.out.println("Divided by 3 & 5: ");
		do{
	
			if(num%3==0 && num%5==0) {
				System.out.print(num + ", ");
				
			}
			num++;
		}while(num<=100);
		break;	
default:
	System.out.println("Invalid option");

}


}
}