package IfElse;

public class EligibleForVote {
	public static void main(String[] args) {
		int age = 20;
		
		if(age > 18 && age < 100) {
			System.out.println("You can give vote..");
		}else {
			System.out.println("You cannot give vote..");
		}
	}
}
