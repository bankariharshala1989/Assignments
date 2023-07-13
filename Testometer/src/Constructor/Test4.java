package Constructor;

public class Test4 {

	public static void main(String[] args) {
	Test t= new Test(6);
	System.out.println(t.i);
	}
}
class Test{

	  int i;

	  Test(int i){

	    this.i = i;
	    System.out.println(i);

	  }

	}
