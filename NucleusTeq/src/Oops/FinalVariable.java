package Oops;

public class FinalVariable {
	
	 // int x = 9; // instance variable only gets memory when the object created.
	 
     final static int x = 10;
     final static int MaxTemperature = 45;
     void finalVariale() {
    	 System.out.println("Final variable cannot be modified");
     }
	
	public static void main(String args[]) {
		
	//	int y = x++; // final variable cannot be modified.
		System.out.println("Final variable : " + x);
		System.out.println("Maximum Temperature of Heater can be extended to " + MaxTemperature +"degrees");
		
	}
}
