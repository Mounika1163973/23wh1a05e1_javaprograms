package java_programming;
class Animal{
	void eat() {
		System.out.println("Animals eat differently");
	}
	void sound() {
		System.out.println("Animals sound");
	}
}
class lion extends Animal{
	void eat() {
		System.out.println("lion eats mammals");
	}
	void sound() {
		System.out.println("Lion sounds are scary");
	}
}
class tiger extends Animal{
	void eat(){
		System.out.println("Tigers eats other animals");
	}
	void sound() {
		System.out.println("Tigers sounds are different from lion");
	}
}
class Panther extends Animal{
	void eat(){
		System.out.println("Panther eats the other animals");
	}
	void sound() {
		System.out.println("Panther sounds are similar to cheetah");
	}
	
}
public class animalEatSound {
	public static void main(String[] args) {
		Panther myObj = new Panther();
	    myObj.eat();
	    myObj.sound();
	}
	

}
