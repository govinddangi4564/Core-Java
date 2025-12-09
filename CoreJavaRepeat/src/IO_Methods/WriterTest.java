package IO_Methods;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterTest {
	public static void main(String[] args) throws IOException{
//		FileWriter fw = new FileWriter("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\java.txt"); // Erase existing data
		FileWriter fw = new FileWriter("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\java.txt", true); // Dont erase existing data
		
//		fw.write('A');
//		fw.write('B');
//		fw.write('C');
//		fw.write("DEFG");
//		fw.write(" Govind \n");
//		fw.write("\nAkshat   ");
//		fw.write("Rizwan....");
		
		fw.write("--------------------------------------");
		
//		It is append with existing data
		
		PrintWriter pw = new PrintWriter(fw);
		pw.print("Indore");
		pw.print(" Bhopal");
		pw.print(" Rajgarh");
		pw.println(" Jhabalpur");
		pw.println(" Delhi");
		pw.println(" Mumbai");
		
		fw.close();
		
		System.out.println("Successfully writen data");
	}
}
