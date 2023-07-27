//Create a Java program that reads data from a text file specified by the user. The program
//should handle potential exceptions such as the file not found, permission issues, or other
//file-related exceptions gracefully using proper exception handling techniques. Provide
//appropriate error messages for each type of exception.


package ExceptionHandling;

import java.io.*;

public class FileReadException  {
	
	public static void main(String args[]) throws IOException {
	
		FileReader fr = new FileReader("fil.txt");
		
		BufferedReader br = new BufferedReader(fr); // reads the data form buffer by line
		
		String data;
		
		try {
		while((data = br.readLine())!= null);
		{
			
			System.out.println(data);
		}
		System.out.println("Hello");
		}
		
       catch(IOException  f) {
			f.printStackTrace();
		}
		
		System.out.println("Hello");
		}
		
		
}