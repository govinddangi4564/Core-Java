package Array;

import java.util.Scanner;

public class CheckIdentityMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows size of Matrix : ");
		int m = sc.nextInt();
		System.out.println("Enter column size of Matrix : ");
		int n = sc.nextInt();

		if (m != n) {
			System.out.println("Not an Identity Matrix (Matrix must be square)");
			return;
		}

		int[][] arr = new int[m][n];

		System.out.println("Enter the elements of the matrix : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		boolean isIdentity = true;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					if(arr[i][j] != 1) {
						isIdentity = false;
						break;
					}
				}else {
					if(arr[i][j] != 0) {
						isIdentity = false;
						break;
					}
				}
			}
		}
		if(isIdentity) {
			System.out.println("Matrix is an Identity Matrix");
		}else {
			System.out.println("Matrix is not Identity Matrix");
		}
	}
}
