package Multithreading;

//class Account{
//	
//	private int balance;
//	
//	public Account(int balance) {
//		// TODO Auto-generated constructor stub
//		this.balance = balance;
//	}
//	
//	public void Credited(int amount) {
//		
//		System.out.println("Enter the amount for depositing : ");
//		balance = balance + amount;
//		System.out.println("Deposited : "+balance);
//		
//		
//	}
//	
//	
//}
class Account  {
	
	public int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
		
}
class Credited extends Thread{
	
	private int deposite;
	public Credited(int deposite) {
		// TODO Auto-generated constructor stub
		this.deposite = deposite;
	}
	
	public void run() {
		
	//	TotalBalance = TotalBalance+deposite;
		System.out.println("Amount redited : "+deposite);
	}
}

class Debited extends Thread{
	
	public void run() {
		
		System.out.println("Amount Debited : ");
	}
}

public class BankBalance {

    public static void main(String[] args) {
		
    //	Account account = new Account(100);
    	
    	int TotalBalance = 100;
    	Credited credited = new Credited(20);
    	
    	
    	
    	
	}
	
}
