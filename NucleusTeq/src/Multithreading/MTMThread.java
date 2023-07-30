package Multithreading;

// Performing multiple tasks using multiple threads.

class Thread1 extends Thread{
	
	public void run() {  // music
		
		System.out.println("Performing task 1 using Thread1..");
	}
}

class Thread2 extends Thread{
	
	public void run() { // video
		
		System.out.println("Performing task 2 using Thread2..");
	}
}

class Thread3 extends Thread{
	
	public void run() { // timer
		
		System.out.println("Performing task 3 using MyThread3..");
	}
}


public class MTMThread {
	
	public static void main(String[] args) {
		
		Thread1 obj1 = new Thread1(); // thread one 
		obj1.start();
		
		Thread2 obj2 = new Thread2(); // thread two
		obj2.start();
		
		Thread3 obj3 = new Thread3(); // thread three
		obj3.start();
	}

}
