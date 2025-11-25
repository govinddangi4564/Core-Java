package Method_Overriding;

public class TestAccount {
	public static void main(String[] args) {
		Account ac = new Account();
		Account as = new SavingAccount();
		SavingAccount sa = new SavingAccount();
		
		System.out.println(ac.getBalance());
		System.out.println(as.getBalance());
		System.out.println(sa.getBalance());
	}
}
