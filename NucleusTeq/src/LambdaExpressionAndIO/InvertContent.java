package LambdaExpressionAndIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InvertContent {

	public static void main(String[] args) throws IOException {
	
		FileWriter fWriter = new FileWriter("Invert.txt");
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		String string = "Hello there I am Sneha";
		bWriter.write(string);
		bWriter.flush();
		bWriter.close();
		
		FileReader fReader = new FileReader("Invert.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		
	//	String revString = "";
		
		List<String> listofStrings = new ArrayList<String>();
		
		int line;
		
	//	for(int line)
	
		
		
	
	}
}
