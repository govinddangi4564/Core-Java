package Encapsulation;

public class BankAccount_Main {
	public static void main(String[] args) {
		
		BankAccount Acc = new BankAccount();
		
		Acc.setbalance(50000);
		Acc.setpin(1234);
		Acc.username("Govind");
		Acc.setAccNo(12556652);
		Acc.withdraw(1000);
		
		System.out.println();
	}
}
