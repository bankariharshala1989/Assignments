package Method;

public class ParamerizedMethod {

	public static void main(String[] args) {
		
		int a= ParamerizedMethod.Subtraction(50, 10);
		ParamerizedMethod p= new ParamerizedMethod();
		int b= p.Addition(50, 10);
		System.out.println("Addition = " +b);
		System.out.println("Subtraction =" +a);
				
	}
	
	int Addition(int i,int j){
		return i+j;
		
	}

	static int  Subtraction(int i,int j) {
		return i-j;
	}
	
}
