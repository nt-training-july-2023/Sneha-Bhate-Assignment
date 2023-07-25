package Oops;

public class FinalBlankVariable {
	
	final int MaxTemperature; // final blank variable.
	final int MinTemperature;
	
	// Can be initialized by block.
	{
	  MaxTemperature =  45;
	  System.out.println("Maximum Temperature of Heater can be extended to " + MaxTemperature +"degrees");
	}
	
	// Can be initialized by constructor.
	
	FinalBlankVariable(){
		
		MinTemperature = 11;	
		System.out.println("Minimum Temperature of Heater can be extended to " + MinTemperature +"degrees");
	}
	
	public static void main(String args[]) {
		  
		FinalBlankVariable f = new FinalBlankVariable();
		
	}

}
