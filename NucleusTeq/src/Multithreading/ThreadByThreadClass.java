package Multithreading;

class MyThread extends Thread{
	
	public void run() { // running state 
		
		System.out.println("My Thread is running by Extendning the Thread class..");
	}
}
public class ThreadByThreadClass {
	
	public static void main(String[] args) {
	
	MyThread obj = new MyThread(); //creating a thread  (born state)
	
	obj.start(); // thread in runnable state
	
}
}
