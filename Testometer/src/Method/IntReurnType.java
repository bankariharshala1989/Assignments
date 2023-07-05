package Method;

public class IntReurnType {

	public static void main(String[] args) {
		
		int a= average(10, 20, 30, 40);
		System.out.println(a);
		
		IntReurnType i= new IntReurnType();
		int b=i.average(10, 20, 30);
		System.out.println(b);

	}

	int average(int i, int j,int k){
		return ((i+j+k)/3);
		}
	
	static int average(int i, int j,int k, int m){	
		return ((i+j+k+m)/4);
		}
	
	
}
