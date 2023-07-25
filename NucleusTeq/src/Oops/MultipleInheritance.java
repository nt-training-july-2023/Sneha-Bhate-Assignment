package Oops;


interface RestrauntMenu{
	
	void Menu();
	
}

interface RestrauntVenue{
	
	void venue();
}

class RestrauntClass implements RestrauntMenu, RestrauntVenue{
	
	public void Menu() {
		
		System.out.println("Menu : ");
		System.out.println("1.Maggi\n2.Noodles\n3.Paneer Tikka");
	}
	
	public void venue() {
		
		System.out.println("Venue : ");
		System.out.println("1.Ground\n2.Hall\n3.Garden");
	}
	
	
}
public class MultipleInheritance {
	
	public static void main(String args[]) {
		
		RestrauntClass R = new RestrauntClass();
		
		R.Menu();
		R.venue();
		
	}

	}


