package Multithreading;

import java.util.Scanner;

public class KBC {
	public static void sleep(int s) {
		try {
			Thread.sleep(s * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("******************** Welcome to KBC **********************");
		sleep(2);
		System.out.println("My name is Amitabh Bacchan");
		sleep(1);
		System.out.println("Aap khel rhe h KBC");
		sleep(2);

		System.out.println("Q1. Who is the president of India ?");
		sleep(2);
		System.out.println(
				"a. Dr. Rajendra prasad \t b. Dr. APJ Abdul kalam \nc. Dr. Manmohan singh \t d. smt Dropati murmu");
		String qa = sc.next();
		sleep(3);

		if (qa.equalsIgnoreCase("d")) {
			System.out.println("Sahi Jawab.... Ab badte h agle prashn ki aur.......");
			sleep(1);

			System.out.println("Q2. Who is the first women Prime minister of India ?");
			sleep(2);
			System.out.println(
					"a. Ms. Pratibha patil \t b. Ms. Indira Gandhi \nc. Ms. Soniya gandhi \t d. smt Dropati murmu");
			qa = sc.next();
			sleep(3);

			if (qa.equalsIgnoreCase("b")) {
				System.out.println("Sahi Jawab.... Ab badte h agle prashn ki aur.......");
				sleep(1);

				System.out.println("Q3. Who is the Inventer of Bulb ?");
				sleep(2);
				System.out.println(
						"a. Dr. Jhatka \t b. Mr. Thomas Alva Aidisan \nc. Ms. Soniya gandhi \t d. smt Dropati murmu");
				qa = sc.next();
				sleep(3);

				if (qa.equalsIgnoreCase("b")) {
					System.out.println("Sahi Jawab.... Ab badte h agle prashn ki aur.......");
					sleep(1);

					System.out.println("Continue...................");
				} else {
					System.out.println("Wrong answer..........");
				}
			} else {
				System.out.println("Wrong answer..........");
			}
		} else {
			System.out.println("Wrong answer..........");
		}

	}

}
