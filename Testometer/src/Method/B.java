package Method;

class A{

	  public int add(int i , int j){
		  System.out.println(i+ "and " +j);
	    return i+j;	   
	  }

	}
	
class B{
	  public static void main(String[]  args){

	    A a1 = new A();
	 int e= a1.add(a1.add(10,20),a1.add(30,40));
	 System.out.println(e);

	  }
	}
	
	/*
	 a1.add(10,20) => 30
	 a1.add(30,40) => 70
	 a1.add(30,70) => 100
	 
	 */
	