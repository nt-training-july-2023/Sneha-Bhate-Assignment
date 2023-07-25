package Oops;

abstract class University{
	
	abstract void departments();
}


public class AbstractClass extends University{
	

public void departments() {
		
		System.out.println("IT, CS, Mechanical, Electronics");
	
}

public static void  main(String []args) {
	

       University U = new AbstractClass();
       U.departments();


}
}


