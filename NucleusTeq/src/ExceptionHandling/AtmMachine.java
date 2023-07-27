//Design a Java program that simulates an ATM machine. Prompt the user to enter their
//account balance and the amount they want to withdraw. Handle the scenario where the
//user enters non-numeric or negative values for balance or withdrawal amount. If any invalid
//inputs are detected, throw a custom exception called InvalidInputException with an
//appropriate error message. Implement the InvalidInputException class.

package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends RuntimeException{
	
	InvalidInputException(String message){
		
		super(message);
	}
}
public class AtmMachine {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Amount to save into the Account : ");
		try {
		long savedAmount = sc.nextLong();
		
		if(savedAmount <= 0) {
			
			throw new InvalidInputException("Please enter the valid amount");
		}
		else {
			System.out.println("Your current balance is : " +savedAmount);
			try {
				System.out.println("Enter the Amount to withdraw into the Account : ");
				long withDraw = sc.nextLong();
				if(withDraw > savedAmount) {
					throw new InvalidInputException("Please enter the valid amount");
				}	
				else {
					System.out.println("Wait for the Reponse ... Withdrawing "+ withDraw);
				}
			}
			catch(InvalidInputException ie) {
				ie.printStackTrace();
			}
			catch (InputMismatchException i ){
				
				System.out.println(i);
			}
		}
		}
		catch(InputMismatchException i) {
			System.out.println(i);
		}
		
		
	}
}

