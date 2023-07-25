package String;

public class StringCompare {

	public static void main(String []args) {
		
		String s1 = "Sneha";
		String s2 = "Sneha";
		
		String s3 = new String("NucleusTeq");
		String s4 = "Java";
		
		// Using equals() method which returns boolean - 
		// eqauals compares the value of the string object.
		
		boolean b1 = (s1.equals(s2)) ;
		System.out.println(b1);
		
		boolean b2 = (s3.equals(s4));
		System.out.println(b2);
		
		String s5 = "JAVA";
		String s6 = "java";
		
		// Ignores the Case
		boolean b3 = (s5.equalsIgnoreCase(s5)); 
		System.out.println(b3);
		
		
		// Using == Operator.
		// Compares the object.
		
		String s7= "Sneha";
		String s8 = "Sneha";
		
		String s9 = new String("Sneha");
		
		boolean b4 = s7==s8 ; // true because both are refers to same object.
		System.out.println(b4);
		
		boolean b5 = s8==s9; //false because s9 is created in new instance in non pool.
		System.out.println(b5);
		
		
		
		
	
		
		
		
	}
	
}
