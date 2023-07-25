package Oops;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {

	public static void main(String args[]) throws IOException {
		
		FileReader r =  new FileReader("Info.properties");
		
		 Properties p=new Properties();  
		    p.load(r);  
		    
		    System.out.println(p.getProperty("name"));  
		    System.out.println(p.getProperty("email"));  
		}  
		
	}

