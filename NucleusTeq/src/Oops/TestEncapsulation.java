package Oops;

public class TestEncapsulation {

	public static void main(String []args) {
		
		Employee obj = new Employee();
		obj.setName("Sneha Bhate");
		obj.setEmp_Id(111);
		obj.setPassword("SnehaBhate");
		obj.setPhone("7049729232");
		obj.setSalary(25000);
		
		System.out.println("Employee name : " + obj.getName());
		System.out.println("Employee Id : " + obj.getEmp_Id());
		System.out.println("Employee Phone : " + obj.getPhone());
	 // System.out.println("Employee Password : " + obj.getPassword());
	 //	System.out.println("Employee Phone : " + obj.getSalary());
		
		// getPassword() and getSalary will give compile time error because Salary and 
		// Password is private.
		
		
		
	}
	
}
