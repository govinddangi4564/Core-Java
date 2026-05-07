package OOP;

import java.util.ArrayList;

public class Bank {
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	public void addAccount(Account acc) {
		accounts.add(acc);
		System.out.println("Account added Succefully.");
	}
	
	public void removeAccount(String accNumber) {
		for(Account acc : accounts) {
			if(acc.getAccNumber() == accNumber) {
				accounts.remove(acc);
				System.out.println("Account removed.");
				return;
			}
		}
		System.out.println("Account not found.");
	}
}
