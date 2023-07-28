package MethodOverriding;

public class Main {
public static void main(String[] args) {
	H h= new H();
	h.test();
	I i= new I();
	i.test();
	J j= new J();
	j.test();
}
}
class H{
	 void test(){
		System.out.println("H-> test");
	}
}

class I extends H{
	protected void test(){
	System.out.println("I-> test");
	}
}

class J extends I{
	public void test(){
	System.out.println("J-> test");
}
}

/*
 -visibility of method can not reduce
 -Private method cannot be overridden
 - we cannot access private methods in different class.
 */
