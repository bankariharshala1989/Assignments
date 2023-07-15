package Inheritance;

public class Unidirectional {
public static void main(String[] args) {

	//we can access methods of parent class Emp and child class Boss by creating child class object(b)
 Boss b=new Boss();
 b.leaveApplication();
 b.leavePortal();
 
   //But we cannot access methods of child class by creating parent class object.
 	//Therefore it is unidirectional
 
 Emp e=new Emp();
 e.leaveApplication();
	
}
		
}

class Emp{
	public void leaveApplication() {
		System.out.println("Apply Leave");
	}
}
class Boss extends Emp{	
	
	public void leavePortal(){
		System.out.println("Grant Leave");
	}
}



