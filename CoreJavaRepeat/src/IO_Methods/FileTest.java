package IO_Methods;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) throws IOException {
//		File f1 = new File("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\Funny-Story.txt");
		File f1 = new File("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\Historical-Story.txt");

		if (f1.exists()) {
			System.out.println(f1.getName());
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			System.out.println(f1.canExecute());
			System.out.println("File : " + f1.isFile());
			System.out.println("Folder : " + f1.isDirectory());
			System.out.println(f1.length() + " Bytes");
			System.out.println(new Date(f1.lastModified()));
		} else {
			System.out.println("File/Folder Not Exists");
			f1.createNewFile();
			System.out.println("File Created Successfully");
		}
	}

}
