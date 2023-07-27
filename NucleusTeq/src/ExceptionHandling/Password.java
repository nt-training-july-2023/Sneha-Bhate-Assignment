//Design a Java program that asks the user to enter a password. Check if the password meets
//the criteria of having at least eight characters, containing both letters and numbers. If the
//password does not meet the criteria, throw a custom exception called
//InvalidPasswordException with a suitable message. Implement the
//InvalidPasswordException class.

package ExceptionHandling;

import java.util.Scanner;

class InvalidPasswordException extends RuntimeException{
	
	InvalidPasswordException(String message){
		
		super(message);
	}
}
public class Password {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the password : ");
		String regex = "^(?=.*[A-Za-z0-9]).{8,}$";
		
		try {
		String password = sc.nextLine();
		
	    
		//private static final String REGEX = "[a-zA-Z]";
		if  (!password.matches(regex)){
			
			throw new InvalidPasswordException("Password must contain atleast 8 characters");
		}
		else {
			System.out.println("You are Logged in.");
		}
		
	}
		catch(InvalidPasswordException p) {
			p.printStackTrace();
			}
		}

}
