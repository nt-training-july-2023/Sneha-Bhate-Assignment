package LambdaExpressionAndIO;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	 
	public class FileCopy {
	 
		public static void main(String[] args) throws IOException {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\eclipse-workspace\\NucleusTeq\\src\\LambdaExpressionAndIO//Copyfile1.txt");
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

