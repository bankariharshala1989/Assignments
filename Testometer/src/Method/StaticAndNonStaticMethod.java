package Method;

public class StaticAndNonStaticMethod {

	public static void main(String[] args) {

		StaticAndNonStaticMethod s= new StaticAndNonStaticMethod();
		double m= s.AreaOfSquare(10.5);
		double n = StaticAndNonStaticMethod.AreaOfTriangle(10.5d, 4.2d);
		
		System.out.println("Area of square = " +m);
		System.out.println("Area of triangle = " +n);
	}

	 double AreaOfSquare (double a){
		 return a*a;
	 }
	
	 static double AreaOfTriangle (double w, double l){
		return w*l; 
	 }
	 
}
