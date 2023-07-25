package Oops;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
//import java.io.*;

//The properties object contains key and value pair both as a string.
//The java.util.Properties class is the subclass of Hash table.
//Re - compilation is not required if the information is changed from a properties file:
public class PropertyWrite {
	
	public static void main(String args[]) throws IOException {
		
		Properties p = new Properties();
		
		p.setProperty("name", "Sneha Bhate");
	    p.setProperty("email", "sneha.bhate@nucleusteq.com");
		
		
			p.store(new FileWriter("Info.properties"), "Information of Employee");
		
	}

}
