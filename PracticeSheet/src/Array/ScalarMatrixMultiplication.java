package Array;

import java.util.Scanner;

public class ScalarMatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows size of Matrix : ");
		int m = sc.nextInt();
		System.out.println("Enter column size of Matrix : ");
		int n = sc.nextInt();

		int[][] arr = new int[m][n];

		System.out.println("Enter the elements of the matrix : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter a scalar Value for multiplication Matrix : ");
		int val = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(val * arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
