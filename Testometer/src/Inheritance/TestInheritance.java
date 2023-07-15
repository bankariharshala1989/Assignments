package Inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Child ch =new Child();
		ch.method();
		Parent p=new Parent();
		p.method();

	}

}

class Parent{
	
	public void method(){
		System.out.println("Parent class method");
	}
}

class Child extends Parent{ 
	
}