package OperatorsAndExpressions;

public class IncrementDecrement {

	
	public static void main(String... args) {
		
		int x = 5;
		
		int y = ++x; 
		// firstly the value of x is incremented.
	    // then it is assigned to y.
	    // x = 6 , y = 6
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		int a = 5;
		int b = a++;
		//first the value of a gets assigned to b
		//then incremented.
		// b = 5 ,a = 6
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		
		int d = 4;
		int e = --d;
		//value of d get decremented first
		//then assigned to e.
		// d = 3 , e = 3
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		
		
		int o = 8;
		int p = o--;
		//value of o gets assigned to p
		//then it gets decremented
		// p = 8 , o = 7
		System.out.println("o:"+o);
		System.out.println("p:"+p);
		
        int c = 11;
		
		c = c++ + ++c;
		    
		System.out.println(c); // 24
		
		
		
		
		
		
		
		
		
		
		
	
}
}
