package Encapsulation;

public class BankAccount {
	private double balance;
	private int pin;
	public String username;
	public double AccNo;
	public int withdraw;
	
	public double getbalance() {
		return this.balance;
	}
	
	public void withdraw(int Amount) {
		if(withdraw < balance) {
			balance -= Amount;
			System.out.println("Withdrawal Amount = " + Amount);
			System.out.println("Total balance = " + balance);	
		}else {
			System.out.println("Invallid Amount ");
		}
		
		
	}
	
	public int getpin() {
		return this.pin;
	}
	
	public void  setbalance(double balance) {
		this.balance = balance;
	}
	
	public void setpin(int pin) {
		if(1234 == pin) {
			this.pin = pin;
		}
	}
	public void username(String username) {
		this.username = username;
		
	}
	public double  setAccNo(double AccNo) {
		return this.AccNo;
	}
	
	public void display() {
		 System.out.println();
	}

}
