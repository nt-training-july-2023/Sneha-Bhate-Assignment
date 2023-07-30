package Oops;

class Greeting{  // Parent class
	
	void sayHello() {
		
		System.out.println("Hello");
	}
	
	void f1() {}
	void f2() {}
	void f3() {}
	void f4() {
		
		System.out.println("This is f1()");
	
	} // 
}

class India{ // Outer class
	
	
 //Greeting g = new Greeting() {}; // not an object of greeting class.
 Greeting g = new Greeting() { // Anonymous class (child class and Inner class)
 
 void sayHello() { // Overriden method of Parent class.
	 
	 System.out.println("Namaste");
 }
 
 void f4() { // overriden method
	 System.out.println("f4 this is ..");
 }
 
 void f5() {
	 System.out.println("This is f5...");
 }
 };
}

public class AnonymousClass {
	
	public static void main(String args[]) {
		
		India india = new India();
		
		india.g.sayHello(); // calling the overriden method of child class.
		india.g.f4();
		
	//	india.g.f5(); CT error because the variable which is referring the object of
   // Anonymous class(child and inner) is of Greeting class (parent class)
		
		
	}

}
