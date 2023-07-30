package Multithreading;

class MyThreadRunnable implements Runnable{
	
	public void run() { // overriding run() method of Thread class.
		
		System.out.println("My Thread is running by using Runnable Interface...");
		
	}
	
}
public class ThreadByRunnable {

	public static void main(String[] args) {
		 
		MyThreadRunnable obj = new MyThreadRunnable();
		
		Thread thread = new Thread(obj); // bcz start method is not present in runnable interface 
		thread.start();                 // it is present in Thread class.
		
		
	}
}
