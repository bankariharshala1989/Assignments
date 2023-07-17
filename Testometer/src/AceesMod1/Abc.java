package AceesMod1;

class Xyz {
public int a=10;
protected int b=20;
int c=30;
private int d=40;
	
// we can access all variable in same class
  void methodM(){
	  System.out.println("****Same Class ****");
	  System.out.println("Public variable : "+ a);
	  System.out.println("Protected variable : "+ b);
	  System.out.println("Default variable : "+ c);
	  System.out.println("Private variable : "+ d);
  }
}
 
 
public class Abc{
	public int h=7;
	protected int i=9;
	public static void main(String[] args) {
//	we can access public, protected and default variable in different class in same package.
		
		Xyz x= new Xyz();
		x.methodM();
		System.out.println("--------------------------------");
		System.out.println("****Same Class and Same Package****");
		 System.out.println("Public variable : " +x.a);
		  System.out.println("Protected variable : "+x.b);
		  System.out.println("Default variable : "+x.c);
//		  System.out.println("Private variable : "+x.d); //we can not access private variable in different class

	}
}

/*
//Different Package:
// We can access public variable (h) by creating object of that class 
// We can access protected variable (i) through inheritance
 package AcessMod2;

import AceesMod1.Abc;

public class Lmn extends Abc{

	public static void main(String[] args) {
		Abc a= new Abc();
		System.out.println("Public variable in different package : " +a.h); //
	    Lmn l=new Lmn();
	    l.methodm2();
	}
	
	void methodm2(){
			System.out.println("Protected variable in different package : " +i);
	}
	}
 
 */


