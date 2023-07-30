package Multithreading;

class Thread4 extends Thread{
	
	public void run() {
		System.out.println("Task 4 is executing by : "+Thread.currentThread().getName());
	}
}
class Thread5 extends Thread{
	
	public void run() {
		System.out.println("Task 5 is executing by : "+Thread.currentThread().getName());
	}
}
class Thread6 extends Thread{
	
	public void run() {
		
		Thread.currentThread().setName("Thread 6");
		System.out.println("Task 6 is executing by : "+Thread.currentThread().getName());	}
}
public class RunningThreads {

	public static void main(String[] args) {
		
		Thread4 obj4 = new Thread4();
		obj4.setName("sneha");
	    obj4.start();
	    
	    Thread5 obj5 = new Thread5();
	    obj5.setName("Nucleus");
	    obj5.start();
	    
	    Thread6 obj6 = new Thread6();
	    obj6.start();
	    
	   // System.out.println("Hello..In the main thread");
	    System.out.println("Hello printed by : "+ Thread.currentThread().getName());
	    
		}
}
