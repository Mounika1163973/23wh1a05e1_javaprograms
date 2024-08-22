package java_programming;
public class dog{
	public void doing(){
		System.out.println("The dog is flying");
		
	}

}
class cat extends dog{
	public void doing(){
		
		System.out.println("The cat is roaming");
	}
}
public class overriding {
	public static void main(String[] args) {
	       cat myObj = new cat();
	       myObj.doing();
	}
   
}
