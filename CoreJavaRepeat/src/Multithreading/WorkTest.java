package Multithreading;

public class WorkTest {
	public static void main(String[] args) {
		Work t1 = new Work();
		Work2 t2 = new Work2();
		
		t1.start();
		t2.start();
	}
}
