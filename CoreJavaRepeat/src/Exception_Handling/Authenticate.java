package Exception_Handling;

import java.util.Scanner;

public class Authenticate {
	public static void Authentication() throws LoginException {
		LoginException le = new LoginException();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter user name : ");
		String un = sc.nextLine();
		System.out.println("Enter password : ");
		String pwd = sc.nextLine();

		if (un.equals("Govind") && pwd.equals("123456")) {
			System.out.println("Login successful");
		} else {
			throw le;
		}
	}

	public static void main(String[] args) throws LoginException {
		Authentication();
	}
}
