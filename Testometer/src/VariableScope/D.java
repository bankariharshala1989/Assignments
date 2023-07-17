package VariableScope;


/*
 * Question:
 class Main {
public static void main(String args[]) {
System.out.println(fun());
}
int fun() {
return 20;
}
} 
 */
class D {

	public static void main(String args[]) {
		System.out.println(fun());
		}
		static int fun() {
		return 20;		}
		} 

/*output:Compile error
 If we declare method fun as static then output is 20.

*/