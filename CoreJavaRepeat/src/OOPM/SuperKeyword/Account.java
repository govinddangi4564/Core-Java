package OOPM.SuperKeyword;

public class Account {
	public int getAmount() {
		return 5;
	}
}

class SavingAccount extends Account{
	public int getAmount() {
		return super.getAmount() + 10;
	}
}
