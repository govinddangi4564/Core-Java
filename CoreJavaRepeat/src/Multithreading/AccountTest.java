package Multithreading;

public class AccountTest extends Thread{
	static Account ac = new Account();
	
	private String name;
	
	public AccountTest(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			ac.deposite(name, 1000);
		}
	}
	
	public static void main(String[] args) {
		AccountTest t1 = new AccountTest("Govind");
		AccountTest t2 = new AccountTest("Sunil");
		t1.start();
		t2.start();
	}
}
