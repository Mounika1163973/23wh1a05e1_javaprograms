package java_programming;

public class overloading {
	public static void add(int y) {
		int z=y-6;
	    System.out.println(z);
	}
	
	public static void add(double x) {
		double c=x-0.11;
		System.out.println(c);
	}
   public static void main(String[] args) {
	    
	   add(10.11);
   }
}
