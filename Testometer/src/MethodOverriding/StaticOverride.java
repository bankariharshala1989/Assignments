package MethodOverriding;

public class StaticOverride {
public static void main(String[] args) {
	R r= new R();
	r.methodJ();
}
}

class S {
	 static void methodJ(){
		System.out.println("methodJ -> S");
	}
}

class R extends S{
	public void methodJ(){
		System.out.println("methodJ -> R");
	} 
}

/*
-It will give you error as"This instance method cannot override the static method from S"
-Overloading is the mechanism of binding the method call with the method body dynamically 
based on the parameters passed to the method call.
-Static methods are bonded at compile time using static binding. 
Therefore, we cannot override static methods in Java

*/