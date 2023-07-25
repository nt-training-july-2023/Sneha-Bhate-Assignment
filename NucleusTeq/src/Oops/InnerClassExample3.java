package Oops;

// Static Inner class cannot access the non-static members of Outer class.
// Static Inner class can access the static members of Outer class.
// Non static inner class can access the static or non-static member of Outer class.


class Outer1{
	int x = 10; // cannot be accessed by the Inner class.
	static int y = 10; // can be accessed by Inner class.
	void OuterFunction() {
		System.out.println("OuterFunction() is running... ");
		
	}
	static class Inner1 { // A new Data Type.
		
		void InnerFunction() {
			System.out.println("InnerFunction() is running... ");
		//	System.out.println("InnerFunction() is running... " +x); // CT error
			System.out.println("InnerFunction() is running... " +y); // 10
			
		}
	}
}
public class InnerClassExample3 {
	
	public static void main(String []args) {
	          
		        // Object of Outer Class.
		
				Outer1 out = new Outer1();
				out.OuterFunction();
				
				// Object of Inner Class which is static.
				
				Outer1.Inner1 in = new Outer1.Inner1();
				in.InnerFunction();
		
	}

}
