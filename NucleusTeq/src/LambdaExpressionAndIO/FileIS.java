//Explore the different types of subclasses in InputStream & OutputStream.
//Explore the FilterInputStream & FilterOutputStream.
//Create a program to "invert" the contents of a text file: create a file with the same name ending in ".txt" and containing the same lines as the original file but in reverse order (the first line will be the last one, the second will be the penultimate, and so on, until the last line of the original file, which should appear in the first position of the resulting file.)
//Write a Java program to get a list of all file/directory names from the directory: C://Documents.
//Write a program to copy contents of one txt file to other txt file.

package LambdaExpressionAndIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIS {  // FileInputStream is used to read the data from a file.
	
	public static void main(String[] args) throws FileNotFoundException , IOException {
		
		// Establishing the connection stream from java program to file by creating an 
		// object of FileInputStream class.
		
		FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\eclipse-workspace\\NucleusTeq\\src\\LambdaExpressionAndIO\\Myfile.txt");
	    
		
//		int data = fis.read(); // reads the data one byte at a time.
//		int data1 = fis.read();   // returns the data in integer form.
//		int data2 = fis.read(); // returns -1 if data not found
//		
//		System.out.println("Data in MyFile : " + data);
//		System.out.println("Data in MyFile : " + data1);
//		System.out.println("Data in MyFile : " + data2);
//		
//		System.out.println("Data in MyFile : " + (char)data);
//		System.out.println("Data in MyFile : " +(char) data1);
//		System.out.println("Data in MyFile : " + (char)data2);
		
		int data;
	    while((data = fis.read())!= -1) { // read the data once the control reached EOF.
	    	
	    	System.out.print((char)data);
	    }
		fis.close(); // closing the connection.
	}
		
	}
	


