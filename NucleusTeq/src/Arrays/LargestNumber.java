package Arrays;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String []args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		
	
		int size = sc.nextInt();
		int arr[] = new int [size];
		int i;
		
		// Getting the elements of array.
		System.out.println("Enter the Elements of array : ");
		
		for (i = 0;i<size; i++) {
			
			arr[i] = sc.nextInt();
			
			
		}
		
		// Getting first element as max.
		
	     int max = arr[0];
	     
	     // Comparing the first element with rest of the elements.
		
		for ( i = 0 ;i<size;i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
				
			
			}
			
			
		}
		
		// System.out.println("The Largest Element of array is at position : "+i);
		//Position of element if we have duplicate element in array.
		
		//Getting the Largest Element.
		System.out.println("Largest Element is : "+ max);
	
	}
}
