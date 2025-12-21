package Multithreading;

public class HiThreadTest {
	public static void main(String[] args) {
		Runnable rn = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Run using Annonymous");
			}
		};
		
		Thread t = new Thread(rn);
		t.start();
		System.out.println("-----------------------------------------");
		
		Runnable rr = () ->{
			System.out.println("Run using Lambda");
		};
		
		Thread ti = new Thread(rr);
		ti.start();
	}

}
