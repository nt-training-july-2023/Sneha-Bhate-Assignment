package String;

public class StringImmutable {

	public static void main(String... args) {
		
		String s = "Hello";
		
		// Trying to modify s.
		
		s.concat("NucleusTeq"); 
		System.out.println(s); // print -> Hello 
		
		//It doesn't modify string s but it creates a new object in the string pool "Hello NucleusTeq"
		
		
		// Instead we can make a reference variable to store the object.
		
		String str = s.concat("NucleusTeq"); 
		System.out.println(str);
		
	}
}
