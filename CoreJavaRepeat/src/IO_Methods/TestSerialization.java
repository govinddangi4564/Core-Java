package IO_Methods;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\MyMobile.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Mobile m = new Mobile("Techno", "Spark 7", 2021, 74102589, "It is temp value");
		
		oos.writeObject(m);
		fos.close();
		
		System.out.println("Data Persisted");
	}
}
