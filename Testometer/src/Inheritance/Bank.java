package Inheritance;

public class Bank {

	public static void main(String[] args) {
	
		HDFC h=new HDFC();
		h.method1();
		h.method3();
		h.method6();
		
		
		JSKB j=new JSKB();
		j.method2();
		j.method5();
		j.method6();
				
	}
  public void method6() {
	 System.out.println("Bank");
  }
	
}

// single level inheritance ->  A class inherits properties from a single class. 
//For example-> UrbanBank inherits Bank.
class UrbanBank extends Bank{    			
	
	public void method1() {
		System.out.println("Urban Bank");
		
	}		
}

class RuralBank extends Bank{
	
	public void method2() {
		System.out.println("Rural Bank");
		
	}
}
//Multi level inheritance -> A class inherits properties from a class which again has inherits properties
//For example-> HDFC inherits UrbanBank & UrbanBank inherits Bank.
class HDFC extends UrbanBank{
	public void method3() {
		System.out.println("HDFC Bank");
	}
	
}

//Hierarchical inheritance - Multiple classes inherits properties from a single class.
//For example -> HDFC inherits UrbanBank and SBI inherits UrbanBank
class SBI extends UrbanBank{
	public void method4() {
		System.out.println("SBI Bank");
	}	
}

class JSKB extends RuralBank{
	public void method5() {
		System.out.println("JSKB Bank");
	}
}