package Array;

import java.util.Scanner;

public class CopyElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int arr1[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = arr[i];
		}

		System.out.println("New array : ");

		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
