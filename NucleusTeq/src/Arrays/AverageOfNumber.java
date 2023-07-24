package Arrays;

import java.util.Scanner;

public class AverageOfNumber {

	
	public static void main(String []args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		
		System.out.println("Enter the elements of array : ");
		
		// Getting the elements of array.
		for (int i =0 ;i<size; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		// Getting average of the elements of array.
		
		int sum = 0;
		int average = 0;
		for (int i=0; i<size; i++) {
			
			sum = sum + arr[i];
			
			
		}
		
		average = sum/size;
		System.out.println("Average of the Elements of the array is : " +average);
				
		
	}
}
