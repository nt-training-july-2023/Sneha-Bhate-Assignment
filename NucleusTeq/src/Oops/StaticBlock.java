package Oops;

class StaticBlockInJava{
	
	static String str = "NucleusTeq";
	
	// static block can access only static members
    // static block only executes once for the whole class no matter how many objects were created.
   
	static
	{
		System.out.println("Static Block Executing : "+ str);
	}
}

public class StaticBlock {
	
	public static void main(String args[]) {
	
		 new StaticBlockInJava(); // Static block executed even before the creation of object.
		//StaticBlockInJava.str = "Hello";
		//System.out.println("Static Block Executing : "+ StaticBlockInJava.str);
	
	}
}
