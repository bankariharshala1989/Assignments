package Static;


class A{
static int i = 10;
}
public class StaticVariableScope {

		public static void main(String[] args){
		System.out.println(A.i);
		A a1= new A();
		System.out.println(a1.i);
		}
		}




