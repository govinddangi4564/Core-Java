package IO_Methods;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardInput {
	public static void main(String[] args) throws IOException {
		FileWriter fw  = new FileWriter("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\java.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		System.out.println("Enter Data");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		while(!line.equals("Exit")) {
			pw.println(line);
			line = br.readLine();
		}
		fw.close();
		System.out.println("Data Written successfully");
	}

}
