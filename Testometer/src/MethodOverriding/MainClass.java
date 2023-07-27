//check this code and comment 
package MethodOverriding;

public class MainClass {
	public static void main(String[] args) {
		 C c1 = new C(); 
		 	c1.test(); 
	}
}
class A{

	 void test(){
		 System.out.println("Test ->A");
	 } 
	} 

class B extends A{

	 protected void test(){ 
		 System.out.println("Test ->B");
	 } 
	} 

class C extends B{

	 public void test(){
		 System.out.println("Test ->c");
	 } 
	}
//Class A -> test() method override by class B -> test() method
//Class B -> test() method override by class C -> test() method
//c1.test() > output is "Test ->c"