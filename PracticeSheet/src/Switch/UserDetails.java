package Switch;

import java.util.Scanner;

public class UserDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		switch(id) {
		
		case 101:
			System.out.println("Name = Govind Dangi.\nRollNo = 0863CS231062\nMobileNo = 7067624564");
			break;
		case 102:
			System.out.println("Name = Akshat Chouhan.\nRollNo = 0863CS231015\nMobileNo = 9589776251");
			break;
		default : 
			System.out.println("Invalid Id..");
		}
	}
}
