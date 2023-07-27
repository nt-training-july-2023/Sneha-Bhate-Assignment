//Write a Java method that reads data from a text file specified by the user. The method
//should take the filename as a parameter and use the finally block to ensure that any
//resources (e.g., file streams) are closed properly, regardless of whether an IOException
//occurred during file reading or not.

package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class ReadFile{
	
public void readData(String name) throws IOException {
	
	FileReader fr = new FileReader(name);
	
	BufferedReader br = new BufferedReader(fr); 
	try {
		String data;
		while((data = br.readLine())!=null);
		{
			
			System.out.println(data);
		}
		}
		catch(FileNotFoundException f) {
			f.printStackTrace();
		}
		
		}

}

public class FileRead1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file name : ");
		String name = sc.nextLine();
		
		
	
	}

}
