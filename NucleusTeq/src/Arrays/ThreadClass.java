package Arrays;

public class ThreadClass extends Thread{
	
	public void run() {
		
		for (int i = 0 ;i<3 ;i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				
				System.out.println("Exception Handled");
			}
			
		}
	}
	public static void main(String []args) {
		
		ThreadClass obj1 = new ThreadClass();
		obj1.run();
		
		ThreadClass obj2 = new ThreadClass();
		obj2.run();
		
		
	}
	
	

	
}
