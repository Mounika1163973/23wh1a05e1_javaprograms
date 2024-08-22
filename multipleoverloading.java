package java_programming;

public class multipleoverloading {
	final public static int add(int x,int y) {
		int z=x+y;
		return z;
	}
    public static int add(String name,String place) {
    	int x=name.length();
        return x;
    }
    public static void main(String[] args) {
    	multipleoverloading myObj = new multipleoverloading();
    	System.out.println(myObj.add(12.3, 13.4));
    }
}
