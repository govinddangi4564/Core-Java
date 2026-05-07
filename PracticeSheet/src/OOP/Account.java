package OOP;

public class Account {
	private String accHolderName;
	private String accNumber;
	private Double balance;
	private String branch;

	public Account(String accHolderName, String accNumber, Double balance, String branch) {
		this.accHolderName = accHolderName;
		this.accNumber = accNumber;
		this.balance = balance;
		this.branch = branch;
	}
	
	public String getAccNumber() {
		return accNumber;
	}

}
