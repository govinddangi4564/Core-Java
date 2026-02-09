package Multithreading;

public class RunnableInterface {
	public static void main(String[] args) {
		Thread task = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				 System.out.println("Task : " + i);
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		task.start();
	}
}
