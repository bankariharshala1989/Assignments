//Write non-static method and check visibility with private, default, protected and public

package AcessMod2;


public class NonStat {
	public int p=1;
	protected int q=2;
	int r=3;
	private int s=4;
	
	
	 void nsMethod (){
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
			
	}
	
	public static void main(String[] args) {
		NonStat ns =new NonStat();
		ns.nsMethod();
	}
}

//we can access all instance variable in non static method
//we can access non static method by creating object of that class. 