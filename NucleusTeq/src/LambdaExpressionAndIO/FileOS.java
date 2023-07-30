package LambdaExpressionAndIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOS {
	
	public static void main(String[] args) throws FileNotFoundException , IOException{
		
		FileOutputStream fos = new FileOutputStream("MyFile1.txt");
		
		fos.write(5); // writes the data into the file one byte at a time.
		
		System.out.println("data saved ");
		
		fos.close();
	}
}
