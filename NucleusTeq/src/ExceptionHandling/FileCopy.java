//Write a Java program that copies the content of one text file to another. The program should
//take the filenames of the source and destination files as user input. Implement exception
//handling to deal with potential IOExceptions that may occur during file reading and writing.
//Provide appropriate error messages for file-related exceptions.

package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class FileCopy {
 
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\eclipse-workspace\\NucleusTeq\\src\\ExceptionHandling\\Copyfile1.txt");
		FileOutputStream fos = new FileOutputStream("Copyfile2.txt");
		
		int data;
		while((data = fis.read()) != -1) {
			
			fos.write(data);
		}
		System.out.println("File copied");
		
		fis.close();
		fos.close();
	}

	
}
