package Oops;

class StaticClass1{
	
	static class MyClass{
		
		public static String str = "Sneha";
		
	}
}
public class StaticClass {
	
	public static void main(String args[]) {
		
		System.out.println(StaticClass1.MyClass.str);
		
	}

}
