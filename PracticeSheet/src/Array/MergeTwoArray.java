package Array;

import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of 1st array:");
		int n = sc.nextInt();

		System.out.println("Enter size of 2nd array:");
		int m = sc.nextInt();

		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		int[] arr3 = new int[n + m];

		System.out.println("Enter elements of 1st Array :");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter elements of 2nd Array :");
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < m; i++) {
			arr3[n + i] = arr2[i];
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

	}
}
