/*	
package VariableScope;

public class M {

public static void main(String args[]) {
	System.out.println(fun());
	}
	
	static int fun() {
		static int x= 0;
		return ++x;
	}
} 
output of above code is compile error. we can correct it either we have to declare "static int x= 0;"
variable outside the main method or we have to remove static keyword 
*/

 // correct code
  package VariableScope;

public class M {
	static int x= 0;
public static void main(String args[]) {
	System.out.println(fun());
	}
	
	static int fun() {
		
		return ++x;
	}
} 

//output -> 1 
 
		