package RuntimePoly;

public class RunPoly2 {
public static void main(String[] args) {
	Car1 c1 = new Maruti1();
	c1.method1();
	//Maruti c2 = new Car(); // error because we cannot create parent class object by giving child class reference
	//c2.method1();
}
}


class Car1{
public void method1(){
System.out.println("Car-method1");
}
}
class Maruti1 extends Car1{
public void method1(){
System.out.println("Maruti-method1");
}
}