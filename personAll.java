package java_programming;
import java.util.*;
class Person{
	void getFirstName() {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		System.out.println("The firstname of the employee is : " + " " + firstName);
	}
	void getLastName() {
		Scanner sc = new Scanner(System.in);
		String lastName = sc.nextLine();
		System.out.println("The lastname of the employee is : " + " " + lastName);
	}
}
class Employee extends Person{
	void getEmployeeId() {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		System.out.println("The id of Employee is :" +  " "   + id);
	}
	void getLastName() {
		Scanner sc = new Scanner(System.in);
		String lastName = sc.nextLine();
		String title = sc.nextLine(); 
		System.out.println("The lastname of the employee is : " + " " + lastName);
		System.out.println("The job title of the employee is : " + " " + title);
	}
}
public class personAll {
	public static void main(String[] args)
	{
		Employee myObj = new Employee();
		myObj.getFirstName();
		myObj.getLastName();
		myObj.getEmployeeId();
		
	}
}
