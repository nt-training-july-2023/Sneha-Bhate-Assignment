package String;

public class StringOperations {

	public static void main (String args[]) {
	
		// String concatenation.
		
		// By + operator - (+ operator uses append method of StringBuilder or StringBuffer)
		
		String s1 = "Nucleus" + "Teq";
		System.out .println(s1);
		
		// By concat() method - 
		
		String str = s1.concat(" Family"); 
		System.out.println(str);
		
		// String length. (using length())
		
		String s2 = "Sneha";
		int l = s2.length();
		System.out.println(l);
		
		// Get character at a given position from String. (using charAt())
		
		String s3 = "NucleusTeq"; // starts with index 0.
		char ch = s3.charAt(5);
		System.out.println(ch);
		
		// Check if a String starts with a given character or String.
		// using startWith().

		String s4 = "Hello NucleusTeq";
		
		System.out.println(s4.startsWith("He")); // returns true
		System.out.println(s4.startsWith("N" , 6)); // returns true
		
		
		// Find index of a given character or string from a String.
		// using indexOf().
		
		String s5 = "Hello NucleusTeq , I am Sneha";
		
		int pos1 = s5.indexOf("S");
		System.out.println(pos1);
		
		int pos2 = s5.indexOf("NucleusTeq");
		System.out.println(pos2);
		
		// Replace a character from a String.
		
		String s6 = "Hello NucleusTeq , I am Sneha";
		
		String s7 = s6.replace('q' , 'c');
		System.out.println(s7);
		
		
		// More Methods.
		
		String s8 = " Hello NucleusTeq , I am Sneha";
		System.out.println(s8.toUpperCase());   
		System.out.println(s8.toLowerCase());
		
		System.out.println(s8.trim());
		System.out.println(s8.endsWith("ha"));
		
		
		int a = 2;    
		String s=String.valueOf(a);    //converts into string
		System.out.println(s+2);    
		}  

}
