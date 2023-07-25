package Oops;

final class Train{
	
	private String message;
	
	 Train(String message){
		this.message = message;	
	}
	
	void speed() {
		
		System.out.println("Train is running with the speed of 100 km/hr");
		System.out.println(message);
	}
}
//public class FinalClass extends Train{ // cannot be extended
//	
//}

public class FinalClass{
	
	public static void main(String []args) {
		
		Train obj = new Train("Tarin is running");
		obj.speed();
	}
}

