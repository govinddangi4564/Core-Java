package OOPM.SuperKeyword;

public class AccountTest {
	public static void main(String[] args) {
		Account aa = new Account();
		Account as = new SavingAccount();
		SavingAccount sa = new SavingAccount();
		
		System.out.println(aa.getAmount());
		System.out.println(as.getAmount());
		System.out.println(sa.getAmount());
	}
}
