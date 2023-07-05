package Method;

public class NonParamerizedMethod {

	public static void main(String[] args) {
	greet();
  NonParamerizedMethod n= new NonParamerizedMethod();
  n.display();
	}

	
	static void  greet(){
		System.out.println("Hello");
	}
	
	void display(){
		System.out.println("This is non paramerized method");
	}
}
