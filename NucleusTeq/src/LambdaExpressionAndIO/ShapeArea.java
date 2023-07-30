//2 . Create a functional interface with the name ‘Shape’ and a method ‘area’. 
//Write a program to implement this interface for shapes, rectangle, square, circle, cube,
//sphere, cylinder and find out its area. All the implementation should be within a 
//single class.

package LambdaExpressionAndIO;

import java.util.Scanner;

@FunctionalInterface
interface Shape{
	
	void area();
}

public class ShapeArea {
	
	public static void main(String[] args) {
		   
		Scanner sc = new Scanner(System.in);
		
		Shape rectangle = () ->{	
			
			System.out.println("Enter length and breadth : ");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			System.out.println("Area of Reactangle : " + length*breadth);
		};
		
		Shape square = () -> {
			
			System.out.println("Enter Side of square : ");
			int side = sc.nextInt();
			System.out.println("Area of Square : " + side*side);
			};
			
			Shape circle = () -> {
				System.out.println("Enter radius of circle : ");
				int radius = sc.nextInt();
				System.out.println("Area of Circle : "+ (radius*radius*22)/7);
			};	
			
			Shape cube = () -> {
				
				System.out.println("Enter side of cube : ");
				int cubeSide = sc.nextInt();
				System.out.println("Area of Cube : "+cubeSide*cubeSide*cubeSide);
			} ;
			
			Shape sphere = () ->{
				
				System.out.println("Enter radius of sphere : ");
				int radiusSphere = sc.nextInt();
				System.out.println("Area of Sphere : "+(4*22*radiusSphere*radiusSphere)/7);
			};
			
			Shape cylinder = () -> {
				
				System.out.println("Enter the radius and height cyclinder : ");
				int radius = sc.nextInt();
				int height = sc.nextInt();
				
				System.out.println("Area of Cylinder :"+((2*22*radius)*(height+radius))/7);
				
			};
			
			rectangle.area();
			square.area();
			circle.area();
			cube.area();
			sphere.area();
			cylinder.area();
		 
	}
}
