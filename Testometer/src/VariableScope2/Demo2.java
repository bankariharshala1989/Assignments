package VariableScope2;

public class Demo2 {

	static int test1=100;  // static var
	int test2=200; // instance var

void m1 (){
		int test3=50; // local var
		System.out.println(test1); //in non static method we can access both instance and static var
		System.out.println(test2);
		System.out.println(test3);
	}

static void m2() {
	System.out.println(test1); //we can only access static variable in static method,can not access instance var
}
}
/*
 Local variable -> Local variable are variable which declare inside the method.
 					test3 is local variable which is in method m1 
 Instance variable -> Instance variable are variable which declare inside the class but outside the method.
 					test2 is instance variable within class Demo2 and outside the method m1 & m2.
 Static variable ->	Static variable are variable which declare inside the class but outside the method.
 					It declare with static keyword. 
				
 					
 
 */
