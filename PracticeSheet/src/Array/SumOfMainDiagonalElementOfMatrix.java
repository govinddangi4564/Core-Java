package Array;

import java.util.Scanner;

public class SumOfMainDiagonalElementOfMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows size of Matrix : ");
		int m = sc.nextInt();
		System.out.println("Enter column size of Matrix : ");
		int n = sc.nextInt();
		
		if(m != n) {
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
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					sum = sum + arr[i][j];
				}
			}
		}

		System.out.println("Sum of Diagonal of a matrix = " + sum);
	}
}
