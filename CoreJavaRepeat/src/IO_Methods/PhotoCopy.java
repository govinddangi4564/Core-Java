package IO_Methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PhotoCopy {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\govin\\OneDrive\\Pictures\\Govind.jpg");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\govin\\OneDrive\\Documents\\Copied item\\GovindCopy.png");
		
		int data = fis.read();
		while(data != -1) {
			fos.write(data);
			data = fis.read();
		}
		fos.close();
		System.out.println("Photo Copied Successfully");
		
	}

}
