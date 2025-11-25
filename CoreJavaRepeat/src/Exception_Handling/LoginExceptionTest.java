package Exception_Handling;

import java.util.Scanner;

public class LoginExceptionTest {
	public static void main(String[] args) {
		LoginException le = new LoginException();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name : ");
		String un = sc.nextLine();
		System.out.println("Enter password : ");
		String pwd = sc.nextLine();
		
		if(un.equals("Govind") && pwd.equals("123456")) {
			System.out.println("Login successful");
		}else {
			try {
				throw le;
			}catch(LoginException e) {
				e.printStackTrace();
			}
		}
	}
}
