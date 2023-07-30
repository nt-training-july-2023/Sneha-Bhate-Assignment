package LambdaExpressionAndIO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOS {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("buffer1.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fos);
		
		 String s = "Hello NuleusTeq";    
	     byte b[]=s.getBytes();  // writes the data in the byte format.   
	     bout.write(b);  
	     
	     System.out.println("data saved"); 
	     
	     bout.flush();   // data saved into the the file from buffer  
	     bout.close();    
	     fos.close();    
	        
	}    
		
	}

