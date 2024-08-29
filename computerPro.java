package java_programming;
import java.util.*;
class Computer {
	class Processor{
		void displayDetails() {		
			Scanner sc = new Scanner(System.in);
			String brand = sc.nextLine();
			int speed= sc.nextInt();
			System.out.println(brand);
			System.out.println(speed);
		}
	}
}
public class computerPro {
	public static void main(String[] args) {
		Computer obj = new Computer();
		Computer.Processor myObj = obj.new Processor();
		myObj.displayDetails();
	}

}
