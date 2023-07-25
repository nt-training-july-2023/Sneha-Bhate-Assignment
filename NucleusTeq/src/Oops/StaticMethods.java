package Oops;

public class StaticMethods {
	
	int x = 10;
	static int y = 9;
	
	public static void display() {
		
	 // int c = x++; // static method can only access the static variable. CT error
		int d = y++;
		System.out.println("y is :"+ d );
		}
	
public static void main(String args[]) {
	
	display(); // No need to create object because display() is static.
	           // Also no need to call this by name of class using dot operator bcz main method
	           // static and member of the same class so it can use static method display() and y = 9;
	int e = y++;
	System.out.println("y is :"+ e );
	
}
}
