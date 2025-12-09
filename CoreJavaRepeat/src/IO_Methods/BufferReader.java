package IO_Methods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\Funny-Story.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		fr.close();
	}

}
