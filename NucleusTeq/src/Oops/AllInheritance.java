package Oops;

class Restraunt{
	
	int rooms = 100;
	public void Menu() {
	System.out.println("Menu : ");
	
	}
}

class Restraunt1 extends Restraunt{ // Hierarchical Inheritance
	
	public void Menu1() {
		System.out.println("1.Maggi\n2.Noodles\n3.Paneer Tikka");
	}
}

class Restraunt2 extends Restraunt{ // Hierarchical Inheritance
	
	public void Menu2() {
		
		System.out.println(this.rooms);
		System.out.println("Visit Again :)");
		
	}
}

class Restraunt3 extends Restraunt{ // Single Inheritance
	
	int room_booked;
	int room_available;
	int venues = 3;
	
	public void roomInfo() {
		
		System.out.println("Rooms Booked : " +this.room_booked);
		System.out.println("Rooms Available : "+this.room_available);
		System.out.println("Total Rooms : "+this.rooms);
	}
	
}

class Restraunt4 extends Restraunt3{ // Multilevel Inheritance

	public void venue() {
		
		System.out.println(this.venues);
		System.out.println("Ground\nHall\nGarden");
	}
}

class Restraunt5 extends Restraunt2{  // Hybrid Inheritance
	
	public void Menu3() {
		
	System.out.println("Hope you Enjoyed the Meal !!");
	
	}
}

public class AllInheritance {
	
	public static void main(String args[]) {
		
		
		Restraunt1 R1 = new Restraunt1();
		R1.Menu();
		R1.Menu1();
		
		Restraunt2 R2 = new Restraunt2();
		R2.rooms = 100;
		R2.Menu();
		R2.Menu2();
		//R2.Menu3();
		
		Restraunt3 R3 = new Restraunt3();
		
		R3.room_booked = 75;
		R3.room_available = 25;
		R3.roomInfo();
		
		
		Restraunt4 R4 = new Restraunt4();
		
		R4.venue();
		
		
		Restraunt5 R5 = new Restraunt5();
		
		R5.Menu3();
		R5.Menu2();
	
}

}
