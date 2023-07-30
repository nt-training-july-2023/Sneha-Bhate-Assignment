package Multithreading;

// Performing Single Task using Single Thread.

class MyThread1 extends Thread{
	
	public void run() { // one task
    	
    	System.out.println("Performing Single Task using Single Thread..");
    }
    
}
public class STFSThread {
	
	public static void main(String[] args) { // main thread created by JVM
		
		MyThread1 myThread1 = new MyThread1(); // one thread
		
		myThread1.start();
	}
	
      // Total threads - two  (main thread , MyThread1)
	  

}
