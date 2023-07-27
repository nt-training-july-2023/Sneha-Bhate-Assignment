//Write a Java program that contains a method to calculate the area of a rectangle. The
//method takes two positive integer parameters representing the length and width of the
//rectangle. However, the method should throw a custom exception called
//“InvalidDimensionException” if either the length or width is less than or equal to zero.
//Implement the “InvalidDimensionException” class with an appropriate message. Test the
//method with valid and invalid inputs.

package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidDimensionException extends RuntimeException{
	
	public InvalidDimensionException(String message) {
		
		super(message);
	}
		
}
public class AreaOfRectangle {
	
	public void Area(int length , int width) {
		try {
		if(length<=0 || width <= 0 ) {
			
			throw new InvalidDimensionException("Invalid Input format , Please provide ");
		}
	
		else {
			
			System.out.print("Area of Rectangle is : "+length*width);
			
		}
		}
		catch(InvalidDimensionException e) {
		e.printStackTrace();
	}
	}

	
	public static void main(String []args) {
		
		AreaOfRectangle obj = new AreaOfRectangle();
		
		Scanner sc = new Scanner(System.in);
	
		int length = 0; // Local
		int width = 0;
		try {
		System.out.print("Enter the length of rectangle :");
		length = sc.nextInt();
		
		System.out.print("Enter the length of rectangle :");
		width = sc.nextInt();
		}
		catch(InputMismatchException i ) {
			
			System.out.print(i);
			
		}
		
		obj.Area(length, width);
		
	}

}
