package Static;

public class StaticBlockSequence {
	static {
		System.out.println("first block");
	     }
	    
	static {
		System.out.println("second block");
	     }
	
	public static void main(String[] args){
			
			System.out.println("main method");

			}
}
/*
 Output:
first block
second block
main method
 
 */
