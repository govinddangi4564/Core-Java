package Multithreading;

public class NoThreadTest {
	public static void main(String[] args) {
		NoThread t1 = new NoThread("Govind");
		NoThread t2 = new NoThread("Sunil");
		
		t1.run();
		t2.run();
	}

}
