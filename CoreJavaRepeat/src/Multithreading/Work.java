package Multithreading;

public class Work extends Thread{
	
	@Override
	public void run () {
		for(int i=1; i<=10; i++) {
			 System.out.println("Task 1 : " + i);
		}
	}
}

class Work2 extends Thread{
	
	@Override
	public void run () {
		for(int i=10; i>=1; i--) {
			 System.out.println("Task 2 : " + i);
		}
	}
}
