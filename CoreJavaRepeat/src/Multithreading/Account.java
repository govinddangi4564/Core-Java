package Multithreading;

public class Account {
	private double balance;

	public double getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return balance;
	}

	public void setBalance(double balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

//	public void deposite(String n, double amount) {
//		double bal = getBalance();
//		setBalance(bal + amount);
//		System.out.println(n + "  Amount Deposited, Now your Balance is : " + getBalance());
//	}

//	----------------------------------------------------------------
	
//	public synchronized void deposite(String n, double amount) {
//		double bal = getBalance();
//		setBalance(bal + amount);
//		System.out.println(n + "  Amount Deposited, Now your Balance is : " + getBalance());
//	}


//	----------------------------------------------------------------
	
	public void deposite(String n, double amount) {
		synchronized (this) {
			double bal = getBalance();
			setBalance(bal + amount);
		}

		System.out.println(n + "  Amount Deposited, Now your Balance is : " + getBalance());
	}

}
