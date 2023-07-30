//1) Read and Explore Threads, Thread Method and State of Threads or any topics that you feel needs some more assistance.
//2) Create a program where you check running threads (should be 3 Threads and more)
//3) Create a program which can take input (int) (Ex -10 and display all the numbers below 10 that is 1-9) and preform task - Reverse the list, Fibonacci, Sum of all number
//4) Create a Program where Threads are reading a message and giving acknowledgement (What a particular thread is reading)
//5) Create a Program to print each state of a thread (From creation to termination)
//6) Read about Thread Executor, thread pool
//7) Create a Program to set priority of a thread
//8) Create a program that simulates a banking application where updates on the account balance can happen simultaneously


package Multithreading;

class A extends Thread{

	public void run() {
		
		for(int i=0;i<=100;i++) {
			System.out.println("Hello");
		}
	}
}

class B extends Thread{
	
	public void run() {
	
		for(int i=0 ; i<=100; i++) {
			System.out.println("Sneha");
		}
	}
}

class C extends Thread{
	
	public void run() {
		for(int i=0 ; i<=100; i++) {
			System.out.println("Bhate");
		}
		
	}
}
public class RunningThread {
	
	public static void main(String args[]) {
		
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		
		obj1.start();
		obj2.start();
		obj3.start();
		
	}

}
