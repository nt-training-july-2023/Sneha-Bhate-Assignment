package LambdaExpressionAndIO;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOS {

	  
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
	    	
	    }
}

	       
