package Method_Overriding;

public class Account {
	public int getBalance() {
		return 5;
	}
}

class SavingAccount extends Account{
	public int getBalance() {
		return super.getBalance() + 10;
	}
}
