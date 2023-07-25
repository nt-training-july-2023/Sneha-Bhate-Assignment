package Oops;

class AirConditioner{
	
	public final void temperature() { // final method
		
		System.out.println("AC temperature can be minimised to 10");
		
	}
	
}

public class FinalMethod extends AirConditioner {
	
//	public void temperature() { // cant be overrriden
//	
//	}
	
public static void main(String args[]) {
	
	AirConditioner a = new AirConditioner();
	a.temperature();
	
}
}

	
	


