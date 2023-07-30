package LambdaExpressionAndIO;

	interface Calculator {
		void add (int num1, int num2);
	}

	interface Display{
		int show(String s1, String s2);
	}

	interface Messenger {
		Message getMessage(String name);
	}

	class Message {
		Message(String name){
			System.out.println("Good Afternoon "+ name + " !!!");
		}
	}
	class Calc {
		
		public static void addStaticMethod(int num1, int num2) {
			System.out.println("Addition of "+ num1 + " and " + num2 + " using static method is " + (num1 + num2));
		}
		
		public void addInstanceMethod(int num1, int num2) {
			System.out.println("Addition of "+ num1 + " and " + num2 + " using instance method is " + (num1 + num2));
		}
	}
	public class LambdaMethodReferences {

		public static void main(String args[]) {
			
			//1. Reference to static method
			Calculator staticRef = Calc::addStaticMethod;
			staticRef.add(12, 14);
		
			//2. Reference to non-static or instant method
			Calc calc = new Calc();
			Calculator instanceRef = calc::addInstanceMethod;
			instanceRef.add(12, 10);
		
			//3. Reference to Parameter method
			Display paramRef = String::indexOf;
			int indexValue = paramRef.show("Index", "x");
			System.out.println("Index of 'x' is "+ indexValue);
			
			//4. Reference to a constructor
			Messenger constRef = Message::new;
			constRef.getMessage("Ben");
		}
	}

