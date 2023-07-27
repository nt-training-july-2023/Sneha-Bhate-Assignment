package JavaDoc;

import java.util.Scanner;

class FindArea{
	
	void rectangle(int length , int breadth) {
		
		System.out.println("Area of rectangle :"+ length*breadth);
		
	}
	void triangle(int base , int height) {
		
		System.out.println("Area of triangle :"+ (base*height)/2);
	}
	
	void circle(double r ) {
		
		System.out.println("Area of Circle :"+ (r*r*22)/7);
	}
}
/**
 * @author NucleusTeq
 * @since 2019
 * @version 1.0
 * @see <a href = "https://docs.oracle.com/javase/8/docs/api/">JavaDoc</a>
 */
public class Area {
	
	/**
	 * 
	 * @param args
	 * @param length
	 * @param breadth
	 * @param base
	 * @param height
	 * @param radius
	 */
	public static void main(String []args) {
		
		FindArea obj = new FindArea();
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter length and breadth");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		obj.rectangle(length,breadth);
		
		System.out.println("enter base and hieght");
		int base = sc.nextInt();
		int height = sc.nextInt();
		obj.triangle(base, height);
	
		System.out.println("enter radius");
		double radius = sc.nextInt();
		obj.circle(radius);
		
	}

}
