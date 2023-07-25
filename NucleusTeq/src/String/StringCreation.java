package String;

public class StringCreation {

	
	public static void main(String[] args) {
		
		// Creation of String by Charater array.
		char ch[] = {'s','d','k'};
		String str = new String(ch);
		System.out.println("String by chracter array : "+ str);
		String st = new String("NucleusTeq Global Services and Consulting");
		System.out.println(st);
		
		// Creation of String by String Literal.
		String s = "Hello NucleusTeq !!";
		System.out.println("String by using String Literal: "+s);
		 
		
	}
}
