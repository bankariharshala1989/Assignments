package JavaBasic;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {

/*
write a code to find number of days in a month ?
You can use switch or if else any logic.
If input is 1 then output should be 31
because 1 is Januart and January having 31 days
*/
		System.out.println("****Days in month****");
		System.out.println(" Enter the month :");
		Scanner scan= new Scanner(System.in);
		int i = scan.nextInt();
		
			if(i==1) {
				System.out.println("Number of days in " + i +"st month = 31");
			}else if (i==2)
			{
				System.out.println("Number of days in " + i +"nd month = 28/29");
			}else if (i==3)
			{
				System.out.println("Number of days in " + i +"rd month = 31");
			}else if (i==4)
			{
				System.out.println("Number of days in " + i +"th month = 30");
			}else if (i==5)
			{
				System.out.println("Number of days in " + i +"th month = 31");
			}else if (i==6)
			{
				System.out.println("Number of days in " + i +"th month = 30");
			}else if (i==7)
			{
				System.out.println("Number of days in " + i +"th month = 31");
			}else if (i==8)
			{
				System.out.println("Number of days in " + i +"th month = 31");
			}else if (i==9)
			{
				System.out.println("Number of days in " + i +"th month = 30");
			}else if (i==10)
			{
				System.out.println("Number of days in " + i +"th month = 31");
			}else if (i==11)
			{
				System.out.println("Number of days in " + i +"th month = 30");
			}else if (i==12)
			{
				System.out.println("Number of days in " + i +"th month = 31");
			}else 
			{
				System.out.println("Invalid month");
			}
			 
		}
		
	}


