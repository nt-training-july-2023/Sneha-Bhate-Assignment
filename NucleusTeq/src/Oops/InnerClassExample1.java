package Oops;
 
// If the Inner class is not static.

class Outer {
	int x = 10;
	void OuterFunction() {
		System.out.println("OuterFunction() is running... ");
		
	}
	class Inner { // A new Data Type.
		
		void InnerFunction() {
			System.out.println("InnerFunction() is running... ");
		}
	}
}

public class InnerClassExample1 {
	
	public static void main(String args[]) {
		
	
	// If Inner class is not static.
	
	Outer out = new Outer(); // Object of Outer class
	Outer.Inner in = out.new Inner();	 // Object of Inner class using Outer class
	
	// calling the Method of Outer Class
	
	out.OuterFunction();
	
	//calling the method of Inner Class.
	
	in.InnerFunction();
	

	}
	
}
