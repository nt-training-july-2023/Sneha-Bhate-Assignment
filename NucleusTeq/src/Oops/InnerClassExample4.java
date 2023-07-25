package Oops;
//Static Inner class cannot access the non-static members of Outer class.
//Static Inner class can access the static members of Outer class.
//Non static inner class can access the static or non-static member of Outer class.


class Outer2{
	int x = 10; // cannot be accessed by the Inner class.
	static int y = 10; // can be accessed by Inner class.
	void OuterFunction() {
		System.out.println("OuterFunction() is running... ");
		
	}
	 class Inner2 { // A new Data Type.
		
		void InnerFunction() {
			System.out.println("InnerFunction() is running... ");
		    System.out.println("InnerFunction() is running... " +x); // 10
			System.out.println("InnerFunction() is running... " +y); // 10
			
		}
	}
}
public class InnerClassExample4 {
	
	public static void main(String []args) {
	          
		        // Object of Outer Class.
		
				Outer2 out = new Outer2();
				out.OuterFunction();
				
				// Object of Inner Class by outer class which is not static.
				
				Outer2.Inner2 in = out.new Inner2();
				in.InnerFunction();
				
				
				
		
	}
}
