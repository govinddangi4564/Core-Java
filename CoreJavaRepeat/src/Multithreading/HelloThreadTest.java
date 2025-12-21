package Multithreading;

public class HelloThreadTest {
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread();
		Thread tt = new Thread(t1);
		
		tt.start();
	}
}
