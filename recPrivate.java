package java_programming;
class Rectangle{
	private int len,width;
	
	public int getter() {
		return len*width;
	
	}
	
	public void setter(int l, int b) {
		this.len = l;
		this.width = b;
	}
	
}
public class recPrivate {
	public static void main(String[] args) {
		Rectangle myObj = new Rectangle();
		myObj.setter(4, 6);
		System.out.println(myObj.getter());
		
	}

}
