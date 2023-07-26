//Create Constructor as private access modifier and try to create object for object 

package Constructor;

class P{

	   //private P(){
P(){


	  }

	}

public class PrivateCon {
	public static void main(String[] args){

	  P a1 = new P();

	  }

}

/*
when we try to create object of class having private constructor,
 it show error "The constructor P() is not visible"
if we change constructor as default , then code is working fine.
*/