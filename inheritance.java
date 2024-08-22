package java_programming;
class dog{
	String eat= "eating";
	
}
class sleep extends dog{
	String other= "Sleeping";
	
}
public class inheritance {
	public static void main(String[] args) {
		sleep myObj = new sleep();
		System.out.println(myObj.other + "\n" + myObj.eat);
	}
        
         
        	 
         
}
