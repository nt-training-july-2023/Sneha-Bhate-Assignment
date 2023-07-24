package Loops;

public class NestedLoop {

	public static void main(String... args) {
		
		int maxHours = 24;
		int maxMin = 60;
		int maxSec = 60;
		
		for (int hour = 0; hour<maxHours; hour++) {
			
		   for(int min = 0; min<maxMin ; min++) {
			   
			   for(int sec = 0;sec<maxSec; sec++) {
				   
				   System.out.println(hour + ":" +min+":"+sec);
			   }
		   }
			
		}
		
	}
	
}
