package Loops;

import java.util.Scanner;

public class TypesOfLoops {

public static void main (String... args) {
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1. Table of a Number (while)");
	System.out.println("2. Factorial of a no (do while)");
	System.out.println("3. Sum of First n numbers(For loop)");
	System.out.println("4. For each loop");
	
	
	System.out.println("Enter the choice : ");
	int choice = sc.nextInt();
	
	switch(choice)
	 {
	
	case 1:
	{
	
	// While loop (Entry controlled loop) 
	// program for Table of a number.
	
	
	int num;
	int i = 1;
	
	
	System.out.println("Enter a Number");
	num = sc.nextInt();
	
	while( i <= 10) {
		int table = 0;
		table = num * i;
		System.out.println(table);
		i++;		
	}
	}
	break;

	
	case 2:
		
	// Do while loop (Exit controlled loop)
	// Factorial
		
	int n;
	int i = 1;
	int fact = 1;
	
	System.out.println("Enter the n = ");
    n = sc.nextInt();
	do {
		fact = fact * i;
		
		i++;
	}
	while (i<=n);
		System.out.println("Factorial is :" + fact);

	


	
	break;
	
	case 3:{
		
		// For loop (Entry controlled loop)
		// Sum of n natural numbers.
		
		int j;
		int sum = 0;
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		for (j = 0;j<=number;j++) {
			
			sum = sum + j;
			
	}
		System.out.println("Sum is : " +sum);
		
	 }
	break;
	
	case 4 :
		
		// For each loop - 
		// It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)
	
		String  []cars = {"Mercedes", "BMW", "Ford"};
		for (String s : cars) {
		  System.out.println(s);
		}
		break;
	case 5:
		
		//Exit 
		
		break;
		
		default:{
			System.out.println("Invalid choice please enter among 1,2,3,4");
		}
}
	
	
}
}

	

	
	

