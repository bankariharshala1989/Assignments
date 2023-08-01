package RuntimePoly;

public class RuntimePoly {

	public static void main(String[] args) {
		Car c1 = new Maruti();
		//c1.method2();    // error because we have given parent(Car)class reference
		c1.method1();
		
		// If we want to call method2() we have to create object of that class and give same class reference
		Maruti m1 = new Maruti();
		m1.method2();

	}

}
class Car{
public void method1(){
System.out.println("Car-method1");
}
}
class Maruti extends Car{
public void method1(){
System.out.println("Maruti-method1");
}
public void method2(){
System.out.println("Maruti-method2");
}
}

/*
 In above code when we can see only parent(Car) class methods not child (Maruti) class methods,
  because we have given parent(Car)class reference.
  when we call "c1.method1()" -> output is "Maruti-method1" because car class method1()is 
  Overridden by Maruti class method1()
 
 */

