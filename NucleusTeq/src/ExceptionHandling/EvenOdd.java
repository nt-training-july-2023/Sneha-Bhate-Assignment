//Create a Java program that prompts the user for an integer input and checks if it is an even
//number. If the number is even, print "It is an even number" If the number is odd or non-
//numeric, throw a custom exception called NotEvenNumberException with an informative
//message. Implement the NotEvenNumberException class.

package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class NotEvenNumberException extends RuntimeException{
	
	NotEvenNumberException(String message){
		
		super(message);
		
	}
	
}

public class EvenOdd {
	
	public static void main(String args[]) {
		
		
		   Scanner sc = new Scanner(System.in);
           try {
			System.out.print("Enter the number :");
			int n = sc.nextInt();
			
			if (n%2 == 0) {
				
				System.out.println("Number is Even");
			}
			else 
			{
				
		 	throw new NotEvenNumberException("Not an Even number please enter even number");
			}
		}
		catch(InputMismatchException o) {
			
			System.out.println(o);
		}
           catch(NotEvenNumberException E) {
        	   E.printStackTrace();
           }
	}
	}
