package AceesMod1;

public class StaticMethodCheck {

	//Write static method and check visibility with private, default, protected and public 
	public int a=1;
	protected int b=2;
	int c=3;
	private int d=4;
	
	
	static void sMethod (){
		StaticMethodCheck s=new StaticMethodCheck();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c);
		System.out.println(s.d);
			
	}
	
	public static void main(String[] args) {
		sMethod();
	}
}

// we can access all instance variable in static method, if we create object of that class in that method