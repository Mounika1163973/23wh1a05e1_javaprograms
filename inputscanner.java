package java_programming;
import java.util.Scanner;
public class inputscanner {
      public static void main(String[] args) {
    	  Scanner sc= new Scanner(System.in);
    	  System.out.println("Enter the name:");
    	  String name=sc.nextLine();
    	  System.out.println("Enter the id:");
    	  int id = sc.nextInt();
    	  sc.nextLine();
    	  System.out.println("Enter the dept:");
    	  String dept = sc.nextLine();
    	  System.out.println("Name: " + name + "  " + "id: " + id + " " + "dept: " + dept);
      }
}
