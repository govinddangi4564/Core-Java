package Multithreading;

public class WithThread extends Thread {
	private String name;

	public WithThread(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "  Hello  " + name);
		}
	}
}
