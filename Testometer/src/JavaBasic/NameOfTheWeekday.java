package JavaBasic;

import java.util.Scanner;

public class NameOfTheWeekday {

	public static void main(String[] args) {
		/*
		Write a Java program that keeps a number from the user and generates an integer between 1 and 7 
		and displays the name of the weekday

		 Write a Java program that keeps a number from the user and generates an integer between 1 and 7 
		 and displays the name of the weekday?

		 1 - Sunday

		 2 - Monday

		 3 - Tuesday

		 4 - Wednesday

		 5 - Thursday

		 6 - Friday

		 7 - Saturday
*/
		System.out.println("*****Name of the weekday*****");
		System.out.println("Enter the number :");
		Scanner scan= new Scanner(System.in);
		int i= scan.nextInt();
		
		if(i==1) {
			System.out.println(i +" - Sunday");
		}else if (i==2){
			System.out.println(i +" - Monday");	
		}else if (i==3){
			System.out.println(i +" - Tuesday");	
		}else if (i==4){
			System.out.println(i +" - Wednesday");	
		}else if (i==5){
			System.out.println(i +" - Thursday");	
		}else if (i==6){
			System.out.println(i +" - Friday");	
		}else if (i==7){
			System.out.println(i +" - Monday");	
		}else {
			System.out.println("Invalid Day");
		}
		
	}

}

