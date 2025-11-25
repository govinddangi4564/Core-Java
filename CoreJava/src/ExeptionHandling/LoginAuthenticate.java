package ExeptionHandling;

import java.util.Scanner;

public class LoginAuthenticate {
	public static void authenticate() {

		LoginException le = new LoginException();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter User Name : ");
		String un = sc.nextLine();

		System.out.print("Enter Password : ");
		String  pwd = sc.nextLine();

		if (un.equals("Abcd") && pwd.equals("1234")) {
			System.out.println("Login Successful");
		} else {
			try {
				throw le;
			} catch (LoginException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		authenticate();
	}
}
