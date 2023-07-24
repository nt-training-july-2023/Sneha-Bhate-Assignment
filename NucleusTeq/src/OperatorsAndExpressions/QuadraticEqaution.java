package OperatorsAndExpressions;

import java.util.Scanner;

public class QuadraticEqaution {

	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a , b and c = ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
	
		
		double  d = b * b - 4.0 * a* c;
		
		if(d>0.0) {
		double root1 = (-b + Math.pow(d, 0.5)) / (2.0 *a);
		double root2 = (-b - Math.pow(d, 0.5))/(2.0 * a);
		
		System.out.print("Roots are "+root1 +"and" + root2);
		
		}
		else if (d==0.0) {
		
		}
		double root1 = -b / (2.0 * a);  
		System.out.println("The root is " + root1);  
		}   
		   
		{  
		System.out.println("Roots are not real.");  
		}  
	
		
			
			
		
		
		
	
}
