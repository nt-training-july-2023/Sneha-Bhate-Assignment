package LambdaExpressionAndIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterIS {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("filter.txt");
		FilterInputStream fli = new BufferedInputStream(fis);
		
		int data;
		
		while ((data = fli.read()) !=-1) {
			
			System.out.print((char)data);
			
			
		}
		
		fli.close();
		fis.close();
		
	}
}
