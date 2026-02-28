package Array;

import java.util.Scanner;

public class FindPercentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of subjects : ");
		int m = sc.nextInt();

		int[] arr = new int[m];

		System.out.println("Enter the Marks : ");
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<m; i++) {
			sum = sum + arr[i];
		}
		double per = (sum / arr.length);
		
		System.out.println("Percentage = " + per);
		
	}
}
