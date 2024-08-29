package java_programming;
class Animal{
	void move() {
		System.out.println("Animals move fast");
	}
}
class Cheetah extends Animal{
	void move() {
		System.out.println("Cheetah moves fast");
	}
}
public class animalmove {
	public static void main(String[] args) {
		Cheetah myObj = new Cheetah();
		myObj.move();
	}

}
