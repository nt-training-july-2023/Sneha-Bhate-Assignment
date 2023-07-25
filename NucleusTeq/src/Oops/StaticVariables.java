package Oops;

// Static Variable
class EmployeeOfNucleusTeq{
	
	String name;
	int Emp_id;
	long salary;
	static String organisation; // A variable for whole class created only once.
	
	
	    EmployeeOfNucleusTeq(String name, int emp_id, long salary) {
		this.name = name;
		this.Emp_id = emp_id;
		this.salary = salary;
		
	}
	    public void display()
	    {
	    	System.out.println(name+" "+Emp_id+" "+salary+" "+organisation);
	    }
	}

public class StaticVariables {
	
	public static void main(String args[]) {
	
	EmployeeOfNucleusTeq E1 = new EmployeeOfNucleusTeq("Sneha Bhate",111,30000);
	EmployeeOfNucleusTeq E2 = new EmployeeOfNucleusTeq("Geetisha",112,30000);
	EmployeeOfNucleusTeq E3 = new EmployeeOfNucleusTeq("Rituja",121,30000);
	
	EmployeeOfNucleusTeq.organisation = "NucleusTeq";
	E1.display();
	E2.display();
	E3.display();
	
	}
}

