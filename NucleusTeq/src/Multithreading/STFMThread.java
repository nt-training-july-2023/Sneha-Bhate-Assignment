package Multithreading;

//Performing Single Task using Multiple Threads.

class MyThread2 extends Thread{
	
public void run() { // single task
    	
    	System.out.println("Performing Single Task using Multiple Threads..");
    }
	
}
public class STFMThread {

public static void main(String[] args) {
		
	// Both the threads performs single tasks simultaneously. 
	// It depends on scheduler that which thread executes run() method first.
	
		MyThread2 myThread2 = new MyThread2(); // thread one
		myThread2.start();
		
		MyThread2 myThread = new MyThread2(); // thread two
		myThread.start();
	}
	
}
