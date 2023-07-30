package Multithreading;

class Test{
	
}
public class MainThread {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		// currentThread() static method provides the reference of current Thread
		// getName() provides name of the current thread
	   //System.out.println(Thread.currentThread().getName()); //print main
		Thread.currentThread().setName("Sneha");
		System.out.println(Thread.currentThread().getName());
		System.out.println(100/0);
	}

}
