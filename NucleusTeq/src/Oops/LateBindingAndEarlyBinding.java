package Oops;

class A {
	
	void funA() {
		
		System.out.println("This is funA...");
	}
}
	class B extends A{
		
		void funB() {
			
			System.out.println("This is funB...");
		}
		
		void funA() {
		
			System.out.println("This is overriden funA");
		}
		
	}	

public class LateBindingAndEarlyBinding {
	
	public static void main(String[] args) {
		
		
		A objA = new A();
		objA.funA(); // calling method of A.
		
		A obj = new B(); // reference variable of A referring to the object of B.
		
		
		obj.funA(); // we can only call overriden method of A present in B.(Late Binding)
		
		// obj.funB(); CT error bcz the reference variable is of A . (Early Binding)
		
		B obj2 = new B();
		obj2.funA();
		obj2.funB();
		
	}
	

}
