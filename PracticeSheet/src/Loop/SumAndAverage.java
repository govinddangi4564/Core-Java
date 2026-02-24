package Loop;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		
		System.out.println("Enter 10 numers : ");
		
		for(int i = 0; i < 10; i++) {
			num = sc.nextInt();
			sum = sum + num;
		}
		
		double average = sum / 10.0;
		
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
	}
}
