package Oops;

// If the Inner class is static.

class OuterClass{
	int x = 10;
	void OuterFunction() {
		System.out.println("OuterFunction() is running... ");
		
	}
	static class InnerClass { // A new Data Type.
		
		void InnerFunction() {
			System.out.println("InnerFunction() is running... ");
		}
	}
}

public class InnerClassExample2 {

	public static void main(String []args) {
		
		// Object of Outer Class.
		
		OuterClass out = new OuterClass();
		out.OuterFunction();
		
		// Object of Inner Class which is static.
		
		OuterClass.InnerClass in = new OuterClass.InnerClass();
		in.InnerFunction();
		
		
	}
}
