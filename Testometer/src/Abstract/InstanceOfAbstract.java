package Abstract;

public class InstanceOfAbstract {
public static void main(String[] args) {
	//when we create instance it give you error as " Cannot instantiate the type ToverifInst"
	//ToverifInst t= new ToverifInst();
	
	// To run method
	ToverifInst t= new ToverifInst() {};
	t.methodA();
} 
}

 abstract class ToverifInst{
	void methodA() {
		System.out.println("Hello");
	}
}

 //Abstract classes cannot be instantiated, but they can be subclassed.