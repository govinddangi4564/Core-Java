package IO_Methods;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyData {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\Funny-Story.txt");
		FileWriter fw = new FileWriter("C:\\Users\\govin\\OneDrive\\Documents\\Copied item\\Java copied.txt");
		
		int data = fr.read();
		while(data != -1) {
			fw.write(data);
			data = fr.read();
		}
		fw.close();
		System.out.println("File Copied Successfully");
	}

}
