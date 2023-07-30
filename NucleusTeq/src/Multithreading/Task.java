package Multithreading;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Create a program which can take input (int) (Ex -10 and display all the numbers below 
//10 that is 1-9) and perform task - Reverse the list, Fibbonaccii, Sum of all number.
class Digits extends Thread{

	int num;
	public Digits(int num) {
		
		this.num = num;
	}
	public void run() {

		System.out.println("Numbers below  "+num+" is: " );
		for(int i = num; i > 0 ; i--) {
			
			System.out.println(i);
			
		}
		
	}
}

class Reverse extends Thread{
	
	public void run() {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(1);
		list.add(5);
		
		System.out.println("List is : "+list);
		
		
		Collections.reverse(list);
		
		System.out.println("Reversed list is : "+list);
		
	
		
	
	}
}

class Fibonacci extends Thread{
	
	int num;
	public Fibonacci(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	public void run() {
		
		int n1 = 0;
		int n2 = 1;
		int n3 ;
		
		System.out.print("Fibonnacii series : ");
		
		System.out.print(n1 +" "+n2);
		
		for(int i = 2; i<num; i++) {
			
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
				
		}
		
	}
}

class SumofAll extends Thread{
	
	int num;
	public SumofAll(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	public void run() {
		
		int sum = 0 ;
		
	for (int i= 0 ; i<=num; i++) {
		
		sum = sum + i;
		
	}
		System.out.print("\nsum of all : "+sum);
		
	}
}

public class Task {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num  = scanner.nextInt();
		
		Digits digits = new Digits(num);
		digits.start();
		
		Reverse reverse = new Reverse();
		reverse.start();
		
		Fibonacci fibonacci = new Fibonacci(num);
		fibonacci.start();
		
		SumofAll sum = new SumofAll(num);
		sum.start();
		
		scanner.close();
		
	}

}
