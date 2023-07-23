package AceesMod1;

class StatVarCheck {
//Write static variable and check visibility with private, default, protected and public

		public static void main(String[] args) {
			Stat s= new Stat();
			System.out.println(s.w);
			System.out.println(s.x);
			System.out.println(s.y);
			
		}
	

}

class Stat{
	static public int w=11;
	static protected int x=12;
	static int y=13;
	static private int z=14;
	
	 void statM1 () {
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

/* we can access static variable( public,protected & default) in other class when we 
create object of that class.
Private static variable we can access only within class.
*/