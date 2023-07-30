// Write a Java program that reads a text file and applies an InputStreamFilter to convert
//all characters to uppercase while reading the data and writes the modified data to another text file using an OutputStreamFilter.


package LambdaExpressionAndIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class UpperCase {

	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("filter.txt");
    	FilterOutputStream flo  = new FilterOutputStream(fos);
    	
    	String string = "I am Sneha";
    	byte b[] = string.getBytes();
    	
    	
    	flo.write(b);
    	flo.flush();
    	
    	System.out.println("data saved");
    	
    	flo.close();
    	fos.close();
    	
		FileInputStream fis = new FileInputStream("filter.txt");
		FilterInputStream fli = new BufferedInputStream(fis);
		
		int data;
		
		while ((data = fli.read()) !=-1) {
			
			char c[] =  ((char)data);
			System.out.print((char)data);
			
		}
		
		fli.close();
		fis.close();
	}
}
