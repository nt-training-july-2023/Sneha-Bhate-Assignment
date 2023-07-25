package Oops;

// Method OverLoading.
class Payment{
	static String payment(String c) {
		return c;
	}
	static String payment(String a , String b ) {
		String c  = a + b;
		return c;
		
	}
}

   public  class ECommerce {
	
	
	public static void main(String []args) 
	{
		System.out.println(Payment.payment("Cash on delivery"));
		System.out.println(Payment.payment("UPI"," Payment"));
		}
			
		}

	


