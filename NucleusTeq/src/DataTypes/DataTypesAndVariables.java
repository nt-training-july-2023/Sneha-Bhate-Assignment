//Write Java programs to declare, initialize, modify all the primitive data types.
package DataTypes;

public class DataTypesAndVariables{

	public static void main(String []args) {
		
		//Data Types - 
		byte b = 9;
		short s = 23;
		int a = 17;
		long l = 898;
		float f = 8.9f;
		double d = 87.89;
		char c = 'S';
		boolean B = true;
		
		System.out.println("byte " +b);
		System.out.println("short " +s);
		System.out.println("integer "+a);
		System.out.println("long "+l);
		System.out.println("float "+f);
		System.out.println("double "+d);
		System.out.println("char "+c);
		System.out.print("boolean "+B);
		
		int sum = 2;
		a = a+sum;
		System.out.println("Updated Integer "+a);
		
		byte sum1 = 2;
		b = (byte)(b + sum1); //byte + byte = int
		
		short sh = 78;
		s = (short) (s + sh); //short + short = int 
		
		int ByteShort = 0;
		ByteShort = b + s; //byte + short = int
		System.out.println("ByteShort "+ByteShort);
		
		
		int ShortInt = 0 ;
		ShortInt = a + s;
		System.out.println("ShortInt"+ShortInt);
		
		long l1 = 923;
		l = l + l1;  //long + long = long
		
		float f1 = 8.3f;
		f = f+f1;  //float + float
		
		double d1 = 789.6;
		d = d + d1;  //double + double = double
		
		char ch = 'Y';
		c = (char) (c + ch); // char + char =int
	    
		 if(B = true)
		 {
			B  = false; 
			 
		 }
		 System.out.println("Updated boolean " +B);
		 
		 int charInt = 0;
		 charInt = c + a; //char + int = int 
		 System.out.println("charInt"+charInt);
//		 
//		 Write Java programs to find out what happen when we use different type of literals for data types.

		 // Literals - 
		 System.out.println("Literals");
		 int num = 0b101;
		 System.out.println(num);
		 
		 int num1 = 0x7E;
		 System.out.println(num1);
		 
		 float f2 = 89;
		 System.out.println(f2);
		 
		 double d2 = 90;
		 System.out.println(d2);
		 
		 double d3 = 12e10;
		 System.out.println(d3);
		 
		 char ch1 = 'a';
		 ch1++;
		 System.out.println(ch1);
		 
		 
		 int i = 't';
		 System.out.println(i);
		 
		 char h = '9';
		 System.out.println(h);
		 
		 float o = 'j';
		 System.out.println(o);
		 
		 float p = 985988895;
		 System.out.println(p);
		 
		
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

