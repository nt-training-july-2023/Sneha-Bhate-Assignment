package LambdaExpressionAndIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedIS {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("buffer1.txt");
		
		BufferedInputStream bin = new BufferedInputStream(fis);
		
		int data; 
		
		while((data = bin.read()) != -1) {
			
			System.out.print((char)data);
		}
		
		bin.close();
		fis.close();
	}
	
}
