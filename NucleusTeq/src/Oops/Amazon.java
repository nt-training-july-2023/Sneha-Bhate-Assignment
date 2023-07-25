package Oops;

class ECommerceCompany{
	
	public void company() {
		System.out.println("E-Commerce websites are great way to buy products online");
	}
}

public class Amazon extends ECommerceCompany {
	
	
	  public void company() {
	  System.out.println("Amazon is one of the largest e-commerce company");
		  
	  }
	  public static void main(String args[]) {
		  
		  Amazon obj = new Amazon();
		  obj.company();
	}

}
