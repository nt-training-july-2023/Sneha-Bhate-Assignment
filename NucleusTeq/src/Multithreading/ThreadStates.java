package Multithreading;


class Thread8 implements Runnable{
	  
	  
		public void run() {
		
			System.out.println(Thread.currentThread().getState());
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(thread.getState());
			System.out.println("Thread State of Thread8 : " + Thread.currentThread().getState());
		}
	
}
class Thread9 implements Runnable{
	  
	  
	public void run() {
	
		System.out.println(Thread.currentThread().getState());
		try {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread State of Thread8 : " + Thread.currentThread().getState());
	}
}

       public class ThreadStates {
		
    	   
	     public static void main(String[] args) {
	    	 
	   // 	 System.out.println(Thread.currentThread().getState());
	    	 Thread8 obj8 = new Thread8();
	    	 Thread thread = new Thread(obj8);
	    	 
	   
	    	 System.out.println(thread.getState());
	    	 thread.start();
	    	 System.out.println(thread.getState());
	    	 
	    	 Thread9 obj9 = new Thread9();
	    	 Thread thread2 = new Thread(obj9);
	    	 System.out.println(thread.getState());
	    	 
	    	 System.out.println(thread2.getState());
	    	 thread2.start();
	    	// System.out.println(thread.getState());
	    	 
	    	
	     }
    
}


