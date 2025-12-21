package Multithreading;

public class HelloThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello Run of HelloThread");
	}
}
