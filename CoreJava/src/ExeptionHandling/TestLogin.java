package ExeptionHandling;

import java.util.Scanner;

public class TestLogin {
	public static void main(String[] args) {
		LoginException le = new LoginException();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter User Name : ");
		String un = sc.nextLine();
		
		System.out.print("Enter Password : ");
		int pwd = sc.nextInt();
		
		if(un.equals("Abcd") && pwd==1234) {
			System.out.println("Login Successful");
		} else {
			try {
				throw le;
			} catch(LoginException e) {
				e.printStackTrace();
			}
		}
	}
}
