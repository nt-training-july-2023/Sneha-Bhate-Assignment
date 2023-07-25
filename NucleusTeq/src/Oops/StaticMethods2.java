package Oops;

class StaticMethod1{
	
    static int y = 9;
	
	public static void display() {
		
		int d = y++;
		System.out.println("y is :"+ d );
		
		}
}

public class StaticMethods2 {
	
	public static void main(String args[]) {
		
	//	int e = y++; // cannot use y bcz it is member of another class
		
		int e = StaticMethod1.y++; // can be used by the class name.
		
		// display(); // cannot be used like this.
		
		StaticMethod1.display(); //can be used by the class name.
		System.out.println("y is :"+ e );
		
		
	}

}
