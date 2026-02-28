package Array;

import java.util.Scanner;

public class SymmetricMatrix {
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
		boolean isSymetric = true;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] != arr[j][i]) {
					isSymetric = false;
					break;
				}
			}
		}
		if (isSymetric)
			System.out.println("It is Symetric Matrix");
		else
			System.out.println("It is not symetric Matrix");
	}
}
