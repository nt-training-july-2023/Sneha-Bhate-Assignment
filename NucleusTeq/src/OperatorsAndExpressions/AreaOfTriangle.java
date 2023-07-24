package OperatorsAndExpressions;

import java.util.Scanner;

public class AreaOfTriangle{

	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the base = ");
		double base = sc.nextDouble();
		System.out.println("Enter the height = ");
		double height = sc.nextDouble();
		
		double Area = (base * height)/2; // double <operator> double = double
		
		System.out.println("Area of Triangle = " +Area);
		
		
		
		
		
	}
	
}
