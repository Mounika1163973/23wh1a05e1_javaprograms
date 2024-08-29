
package java_programming;
import java.util.*;
class Shape{
	void getArea() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a*a);
	}
}
class rectangle extends Shape{
	void getArea() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The area of rectangle is " + " " + a*b);
	}
}
public class shapeArea {
	public static void main(String[] args) {
		rectangle myObj = new rectangle();
		myObj.getArea();
	}

}
