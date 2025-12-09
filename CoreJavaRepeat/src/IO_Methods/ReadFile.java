package IO_Methods;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException{
            FileReader fr = new FileReader("C:\\Users\\govin\\OneDrive\\Documents\\Stories\\Funny-Story.txt");

            int data = fr.read();
            while (data != -1) {
                char cata = (char) data;
                System.out.print(cata);
                data = fr.read();
            }

            fr.close(); // closing stream
        }
    }

