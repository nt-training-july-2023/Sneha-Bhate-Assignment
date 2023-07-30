package Multithreading;


// Priorities are Inherited from parent threads.
class Thread7 extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Thread 7 is running..");
		// since Thread7 is running in the thread main so by default it has the priority same as the main thread.
		System.out.println("Priority of Thread 7 is : "+ Thread.currentThread().getPriority()); 
	}
	
}
public class ThreadPriority {

	public static void main(String[] args) {
		
		// JVM by default sets the priority of threads and allocates them to the cpu.
		// By default priority of main thread is 5.
	//	Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Priority of Thread running in main is : "+Thread.currentThread().getPriority());
		
		Thread7 obj7 = new Thread7();
		obj7.setPriority(8);
		obj7.start();
	}
}
