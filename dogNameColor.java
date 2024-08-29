package java_programming;
class Dog{
	String name;
	String color;
	void Dog (String s,String c) {
		this.name = s;
		this.color = c;
		System.out.println(s);
		System.out.println(c);	
	}
}
public class dogNameColor {
	public static void main(String[] args) {
		Dog myObj = new Dog();
		myObj.Dog("karthik","black");
	}
	
	

}
