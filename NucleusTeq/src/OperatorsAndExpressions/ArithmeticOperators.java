package OperatorsAndExpressions;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String... args) {
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Remainder");
		System.out.println("6. Exit");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the a and b : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.print("Enter your choice : ");
		
		
		
		int choice = sc.nextInt();
		
		switch(choice){
		
		case 1:{
			System.out.println("Addition is : "+ (a+b));
			break;
		}
		case 2: {
			System.out.println("Subtraction is :" +(a-b));
			break;
			
			
		}
		case 3:{
			System.out.println("Product is :"+ (a-b));
			break;
		}
			
		case 4:{
			if (b==0) {
				System.out.println("can't divide : Denominator is zero");
				break;
			}else {
			System.out.println("Division is :" +(a/b));
			break;
		}
		}
		case 5:{
			System.out.println("Remainder is :"+ (a%b));
			break;
		}
		case 6:{
			break;
		}
		default: 
			System.out.println("Invalid Choice Please select among 1,2,3,4,5,6");
			
			
		}
					
		}	
		
	}
	
