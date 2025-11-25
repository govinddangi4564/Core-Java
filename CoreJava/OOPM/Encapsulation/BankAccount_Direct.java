package Encapsulation;

import java.util.Scanner;

public class BankAccount_Direct {
	private double balance;
	private int pin;
	private String username;
	private int AccNo;
	private int withdraw;

	public double getbalance() {
		return this.balance;
	}

	public void withdraw(int Amount) {
		if (withdraw < balance) {
			balance -= Amount;
			System.out.println("Withdrawal Amount = " + Amount);
			System.out.println("Total balance = " + balance);
		} else {
			System.out.println("Invallid Amount ");
		}

	}

	public void deposit(int Amount) {
		if (Amount > 0) {
			balance += Amount;
			System.out.println("Balance After Deposition = " + balance);
		} else {
			System.out.println("Invalid Amount :");
		}
	}

	public int getpin() {
		return this.pin;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public void setpin(int pin) {
		if (1234 == pin) {
			this.pin = pin;
		}
	}

	public void username(String username) {
		this.username = username;

	}

	public void setAccNo(int AccNo) {
		this.AccNo = AccNo;
	}

	public void display() {
		System.out.println();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Pin : ");
		int pin = sc.nextInt();

		if (pin == 1234) {

			BankAccount_Direct Acc = new BankAccount_Direct();
			Acc.username("Govind");
			Acc.setAccNo(12556652);
			Acc.setbalance(50000);

			System.out.println("Account Holder = " + Acc.username);
			System.out.println("Account Number = " + Acc.AccNo);
			System.out.println("Total Balnce = " + Acc.balance);

			System.out.println("Enter 1 for Deposit , Enter 2 for Withdrwal : , Enter 3 for Exit");
			int c = sc.nextInt();

			while (c != 3) {
				switch (c) {
				case 1: {
					System.out.println("Enter the amount to be Deposit :");
					int d = sc.nextInt();
					Acc.deposit(d);
					break;
				}
				case 2: {
					System.out.println("Enter the amount to be Withdrawal :");
					int w = sc.nextInt();
					Acc.withdraw(w);
					break;
				}

				default:
					System.out.println("Invalid Choice");
				}
				System.out.println("Enter 1 for Deposit , Enter 2 for Withdrwal : , Enter 3 for Exit");
				c = sc.nextInt();
			}
			System.out.print("system close");

		} else {
			System.out.println("Your Pin is Incorect :");
		}
	}

}
