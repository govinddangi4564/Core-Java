package IO_Methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\MyMobile.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Mobile mm = (Mobile) ois.readObject();
		
		System.out.println(mm.getCompanyName()+ "   " + mm.getModel() + "   " + mm.getManuYear() + "    " + mm.getImei() + "    " + mm.getTemp());
		
	}
}
