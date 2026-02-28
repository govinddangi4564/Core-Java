package Array;

import java.util.Scanner;

public class SubtractTwoMatrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows size of Matrix 1 : ");
		int m1 = sc.nextInt();
		System.out.println("Enter column size of Matrix 1 : ");
		int n1 = sc.nextInt();

		System.out.println("Enter rows size of Matrix 2 : ");
		int m2 = sc.nextInt();
		System.out.println("Enter column size of Matrix 2 : ");
		int n2 = sc.nextInt();

		if (m1 != m2 || n1 != n2) {
			System.out.println("Subtraction not possible..");
			return;
		}

		int[][] arr1 = new int[m1][n1];
		int[][] arr2 = new int[m2][n2];
		int[][] arr3 = new int[m1][n1];

		System.out.println("Enter the elements of the matrix 1 : ");
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the elements of the matrix 2 : ");
		for (int i = 0; i < m2; i++) {
			for (int j = 0; j < n2; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {
				arr3[i][j] = arr1[i][j] - arr2[i][j];
			}
		}

		System.out.println("Resultant Matrix : ");
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}
}
