package JavaBasic;

import java.util.Scanner;

public class MoneyReturnChange {

	public static void main(String[] args) {

/*
	    Money Return Coin Change Program
	Suppose you are a shopkeeper. Someone bought some items for 56 /- and give you 100 rupee note.
	What Change you will return
	Total amount return = 100 - 56 = 44

	Money Change
	4 * 10 rupee coin
	2 * 2 rupee coin.

	total 6 coins (entities. as you can return rupee-notes too)

	You have to write one program where you will take input from user for Bought amount 
	(56 in example) and money given (100 in example) by person
	provide output return money changes.

*/

System.out.println("Enter Bought amount: ");
Scanner scan= new Scanner(System.in);
int amount =scan.nextInt();
int total;
total=100-amount;

System.out.println("Total amount return = 100 -" +amount +" = " + total);

System.out.println("Money Change");
int tenCoin= total/10;
int twoCoin= (total%10)/2;
System.out.println(tenCoin +" * 10 rupee coin");
System.out.println(twoCoin +" * 2 rupee coin");
System.out.println("total " +(tenCoin+twoCoin) +" coins");
	}

}
