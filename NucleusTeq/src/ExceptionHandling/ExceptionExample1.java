package ExceptionHandling;

public class ExceptionExample1 {

public static void main(String args[]) {
	

	System.out.println("1");
	
	try {
		System.out.println("2");
		int a = 100; //b=2 
		int c;		
	    int b = 0;
		System.out.println("3");
		c = a/b;
		// Exception if b = 0;
		// In try block, whenever an exception caught in any line then the lines of code
		// after that particular line will not get executed and control directly goes to catch block
		System.out.println("4");
		System.out.println(c);
		System.out.println("5");
	}
	
	catch(ArithmeticException e) { // catch block only executes when exception found in try block
		
		System.out.println("6");
		System.out.println(e);	 	
		System.out.println("7");
		System.out.println("Cannot divided by zero");
		System.out.println("7");
	
	}
	System.out.println("Hello"); // will get executed if exception handled
	                            // will not get executed if exception is not handled

}
}

