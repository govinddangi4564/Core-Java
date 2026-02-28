package Array;

import java.util.Scanner;

public class SumOfEachRowAndColumn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows size of Matrix : ");
		int m = sc.nextInt();
		System.out.println("Enter column size of Matrix : ");
		int n = sc.nextInt();

		if (m != n) {
			System.out.println("Not diagonal Matrix present..");
			return;
		}

		int[][] arr = new int[m][n];

		System.out.println("Enter the elements of the matrix : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// Row Sum

		System.out.println("Row Sum : ");
		for (int i = 0; i < m; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("Sum of Row " + i + " is : " + sum);
		}

		// Column Sum

		System.out.println("Column Sum : ");
		for (int j = 0; j < n; j++) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum = sum + arr[i][j];
			}
			System.out.println("Sum of Column " + j + " is : " + sum);
		}
	}
}
