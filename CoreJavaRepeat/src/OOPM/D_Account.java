package OOPM;

public class D_Account {
	private String AccNumber;
	private String AccType;
	private double balance;

	public String getAccNumber() {
		return AccNumber;
	}

	public void setAccNumber(String accNumber) {
		AccNumber = accNumber;
	}

	public String getAccType() {
		return AccType;
	}

	public void setAccType(String accType) {
		AccType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double Amount) {
		double bal = getBalance();
		if (Amount > 0) {
			setBalance(bal + Amount);
			System.out.println("Deposite successfull : " + Amount);
			System.out.println("Total balance after deposit : " + getBalance());
		} else {
			System.out.println("Please Enter Positive Amount : ");
		}
	}

	public void withdraw(double Amount) {
		double bal = getBalance();
		if (Amount > 0 && Amount <= bal) {
			setBalance(bal - Amount);
			System.out.println("Withdrawal successfull : " + Amount);
			System.out.println("Total balance after withdrawal : " + getBalance());
		} else {
			System.out.println("Invalid Withdrawal Request!");
		}

	}

//	acc.fundTransfer(ac2, 15000);

	void fundTransfer(D_Account ax, double amount) {
		double selfBal = getBalance();
		double toBal = ax.getBalance();

		if (selfBal >= amount) {
			setBalance(selfBal - amount);
			ax.setBalance(toBal + amount);
			System.out.println("Transaction Successful");
		} else {
			System.out.println("Transaction Failed, Due To Insufficient Balance");
		}
	}

}
