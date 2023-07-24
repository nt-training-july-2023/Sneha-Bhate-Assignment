package Loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String args[]) {
		
		int rem;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int var = num;
		
		while(num>0) {
			rem = num % 10;
			sum = (sum*10)+rem;
			num = num /10;		
		}
		if (var == sum) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		
	
	}
	
	
}
