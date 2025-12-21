package Multithreading;

public class WithThreadTest {
	public static void main(String[] args) {
		WithThread t1 = new WithThread("Johny*******");
		WithThread t2 = new WithThread("Rajpal-");
		
		t1.start();
		t2.start();
		
		t1.setName("Johny Johny");
		t1.setPriority(8);
		
		System.out.println("T1 Name          : " + t1.getName());
		System.out.println("T1 ID            : " + t1.getId());
		System.out.println("T1 State         : " + t1.getState());
		System.out.println("T1 Priority      : " + t1.getPriority());
				
	}

}
