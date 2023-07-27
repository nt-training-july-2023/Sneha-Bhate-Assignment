//Write a Java program that initializes an array of integers and prompts the user for an index
//to access an element. Handle the scenario where the user enters an invalid index (out of
//bounds) or tries to access an element from a null array. Throw appropriate exceptions
//(IndexOutOfBoundsException and NullPointerException) with informative messages.

package ExceptionHandling;

import java.util.Scanner;

public class ArrayException {
	
	public static void main(String args[]) {
	
	//int arr[] =  null ;
	int arr[] =  {2,4,5,4,2,1} ;
	
	
	Scanner sc = new Scanner(System.in);
	
try {
		
	System.out.println("Array is :");

	for (int j = 0 ;j<arr.length ; j++) {
		System.out.println(arr[j]);
	}
	
		try {
			System.out.println("Enter the Index of element : ");
			int i  = sc.nextInt();

			int element  = arr[i];
			System.out.println("Element found at index " +i+" is :"+element);
			}
		catch(IndexOutOfBoundsException IO)
		{
			IO.printStackTrace();
			}
		
		
	}

    catch(NullPointerException N) {
	N.printStackTrace();

    }
	}
}
	

