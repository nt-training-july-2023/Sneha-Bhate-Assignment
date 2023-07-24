package Arrays;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of row of matrix A : ");
		int row1= sc.nextInt();
		
		System.out.println("Enter the size of column of the matrix A : ");
		int column1 = sc.nextInt();
		
     	int A[][] = new int [row1][column1];
     	
     	// Getting the elements of Matrix A.
     	
     	System.out.println("Enter the elements of Matrix A : ");
     	
     	for(int i = 0 ;i<row1 ; i++) {
     		
     		for (int j = 0 ;j<column1 ; j++)
     		{
     			A[i][j] = sc.nextInt();
     		}
     	}
     	
     System.out.println("Matrix A :");
     	
      for(int i = 0 ;i<row1 ; i++) {
     		
     		for (int j = 0 ;j<column1 ; j++)
     		{
     			System.out.println(A[i][j]);
     			
     		}
      }
     	
     
     	System.out.println("Enter the size of row of matrix B : ");
		int row2= sc.nextInt();
		
		System.out.println("Enter the size of column of the matrix B : ");
		int column2 = sc.nextInt();
		
		int B[][] = new int [row2][column2];
		
		// Getting the elements of Matrix B.
		
		System.out.println("Enter the elements of Matrix B : ");
		
        for(int i = 0 ;i<row2 ; i++) {
     		
     		for (int j = 0 ;j<column2 ; j++)
     		{
     			B[i][j] = sc.nextInt();
     			
     		}
      }
        System.out.println("Matrix B :");
     	
        for(int i = 0 ;i<row2 ; i++) {
       		
       		for (int j = 0 ;j<column2 ; j++)
       		{
       			System.out.println(B[i][j]);
       			
       		}
        }
        
        if (row1 == row2 && column1 == column2)
        {
        
        // Matrix to store the Sum of A and B.
        
        int C[][] = new int [row2][column2];
        
        // Adding Matrix A and B .
        
        for (int i=0 ; i<row2 ; i++) {
        	
        	for(int j=0 ; j<column2 ; j++) {
        		for(int k = 0; k<column2 ; k++) {
        		
        		 C[row2][column2] = A[row1][column1] + B[row2][column2];
        		}
        	}
        }
        
        // Printing Addition of A and B.
        
           for(int i = 0 ;i<row1 ; i++) {
     		
     		for (int j = 0 ;j<column2 ; j++)
     		{
     			
     			
     			System.out.println(C[i][j]);
     			
     		}
     		
           
        }
        }
        else {
        	System.out.println("Matrices cannot be add. Please provide equal number of rows and columns");
        }
      
	}
}
