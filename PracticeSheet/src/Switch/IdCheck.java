package Switch;

import java.util.Scanner;

public class IdCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		
		switch(id) {
		
		case 101:
			System.out.println("Cse Department");
			break;
		case 102:
			System.out.println("It Department");
			break;
		case 103:
			System.out.println("Civil Department");
			break;
		case 104:
			System.out.println("Iot Department");
			break;
		}
	}

}
