package OOPM;

public class D_AccountTest {
	public static void main(String[] args) {
		D_Account acc = new D_Account();
		D_Account ac2 = new D_Account();

		System.out.println("Account 1 Details are : ");
		acc.setAccNumber("123456789000");
		acc.setAccType("Saving");
		acc.setBalance(50000);
		acc.deposit(1000);
		acc.withdraw(3000);

		System.out.println("Account Number : " + acc.getAccNumber());
		System.out.println("Account Type : " + acc.getAccType());
		System.out.println("Total Balance is : " + acc.getBalance());

		System.out.println("-------------------------------------");

		System.out.println("Account 2 Details are : ");

		ac2.setAccNumber("00000000000");
		ac2.setAccType("Current");
		ac2.setBalance(2000);
		ac2.deposit(200);
		ac2.withdraw(50);

		System.out.println("Account Number : " + ac2.getAccNumber());
		System.out.println("Account Type : " + ac2.getAccType());
		System.out.println("Total Balance is : " + ac2.getBalance());

		System.out.println("-------------------------------------");

		acc.fundTransfer(ac2, 15000);

		System.out.println("P1 = " + acc.getBalance());
		System.out.println("P2 = " + ac2.getBalance());
	}
}
