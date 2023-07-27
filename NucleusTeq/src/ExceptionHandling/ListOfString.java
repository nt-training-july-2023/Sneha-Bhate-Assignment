//Design a Java program that defines a list of strings. The program should prompt the user for
//an index and display the element at that index. Handle the scenario where the user enters
//an invalid index (out of bounds) or tries to access an element from a null list. Throw
//appropriate exceptions (IndexOutOfBoundsException and NullPointerException) with
//informative messages.

package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfString {

	public static void main(String []args) {
		
		 List<String> list = new ArrayList<>();
		 //List<String> list =  null;
		 
		 list.add("Hello");
		 list.add("NucleusTeq");
		 list.add("Sneha");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 try {
			 
			 System.out.println("List of String : ");
			 for (String s : list) {
				 System.out.println(list);
			 }
			 
			 try {
				 System.out.println("Enter the Index : ");
				 int i = sc.nextInt();
				 String ele = list.get(i);
				   
				 System.out.println("Element found at index " +i+" is :" + ele);
			 }
				 catch(IndexOutOfBoundsException IO)
					{
						IO.printStackTrace();
						}
		 }
		 
			 
			 catch(NullPointerException N) {
					N.printStackTrace();
				}
			 
	
}
	}
	
	
