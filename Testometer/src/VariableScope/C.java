package VariableScope;

	public class C {
		
		private static int x;

		public static void main(String[] args) {
			System.out.println(fun());
		}
		
		
		static int fun() {
		  return ++x;
		}
		
	} 

//output -> 1