package java_programming;
class Cat{
	String name;
	int age;
	void cat() {
		this.name = "Unknown";
		this.age = 0;
		System.out.println(name);
		System.out.println(age);
		
	}
}
public class nameAge {
      public static void main(String[] args) {
    	  Cat myObj = new Cat();
    	  myObj.cat();
    	  
      }
}
