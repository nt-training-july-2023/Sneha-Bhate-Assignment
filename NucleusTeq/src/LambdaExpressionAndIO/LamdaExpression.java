// 1. Write a Java program to implement a lambda expression to replace vowels with ‘#’ in a given string.

package LambdaExpressionAndIO;
@FunctionalInterface
interface FunInterface{ // functional interface
	
	void  replaceString(String s);
}

public class LamdaExpression {
	
	public static void main(String[] args) {
		
		FunInterface fInterface = (s) -> {
			
			System.out.println("In replaceString()" +s);
			String replaced;
			replaced = s.replaceAll("[aeiouAEIOU]","#" );
			System.out.println("New String : " + replaced);
		
						
		};
		 
		fInterface.replaceString("Hello");
		
		
	}
	

}
