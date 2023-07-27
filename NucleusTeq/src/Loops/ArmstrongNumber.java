package Loops;

public class ArmstrongNumber {

	public static void main(String []args) {
		
		int n = 371;
		int temp;
		int rem;
		int result = 0;
		
		temp = n;
		
		while (temp!=0) {
			
			rem = temp % 10;
			result += Math.pow(rem, 3);
			temp = temp/10;
			
		}
		
		if(result == n)
			 System.out.println(n+" is armstrong no.");
		else {
			System.out.println(n+" is not an armstrong no.");
		}
		
		
	}
	
}
