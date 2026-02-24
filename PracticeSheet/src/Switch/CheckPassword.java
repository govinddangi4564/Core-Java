package Switch;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Password..");
		String pass = sc.nextLine();

		switch (pass) {

		case "Govind@123":
			System.out.println("Correct Password.");
			break;

		default:
			System.out.println("Incorrect Password.");
		}
	}
}
