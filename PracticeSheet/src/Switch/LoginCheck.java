package Switch;

import java.util.Scanner;

public class LoginCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Password : ");
		String pass = sc.nextLine();
		
		switch(id) {
		
		case 101:
			if(pass.equals("admin123")) {
				System.out.println("Login Successful..");
			}else {
				System.out.println("Invalid Password");
			}
			break;
			
		case 102:
			if(pass.equals("user123")) {
				System.out.println("Login Successful..");
			}else {
				System.out.println("Invalid Password");
			}
			break;
		
		default :
			System.out.println("Invalid id");
		}
	}
}
