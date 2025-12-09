package IO_Methods;

import java.io.File;

public class TestList {
	public static void main(String[] args) {
		File fl = new File("D:\\College Notes");
		File ft[] = fl.listFiles();

		String st[] = fl.list();

		for (int i = 0; i < st.length; i++) {

			File fd = new File(fl, st[i]);
			if (fd.isDirectory()) {
				System.out.println(st[i]);
			}
//			System.out.println("----------------------------------------");
//			if (fd.isFile()) {
//				System.out.println(st[i]);
//			}

		}
		System.out.println("----------------------------------------");
		
		for (int i = 0; i < st.length; i++) {
			if(ft[i].isDirectory()) {
				System.out.println(ft[i].getName());
			}
		
		}
	}

}
