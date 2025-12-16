package Multithreading;

public class NoThread {
	private String name;
	
	public NoThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println(i + "  Hello  " + name);
		}
	}
}
