package Array;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		if (n < 2) {
			System.out.println("Second largest not possible");
			return;
		}

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int largest = arr[0];
		int SecondLar = arr[0];

		for (int i = 0; i < n; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] < largest) {
				if (SecondLar == largest || arr[i] > SecondLar) {
					SecondLar = arr[i];
				}
			}
		}

		System.out.println(SecondLar);
	}
}
