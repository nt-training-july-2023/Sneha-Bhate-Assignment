package LambdaExpressionAndIO;

import java.io.File;

public class ListOfFiles {
	
	public static void main(String[] args) {
		
		File filepath = new File("C:\\Users\\sneha\\OneDrive\\Documents");
		
		String filename[] = filepath.list();
		
		System.out.println("List of Directories and files are : ");
		
		for(int i = 0 ;i<filename.length;i++) {
			
			System.out.println(filename[i]);
		}
	}

}
