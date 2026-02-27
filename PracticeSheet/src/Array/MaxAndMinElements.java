package Array;

import java.util.Scanner;

public class MaxAndMinElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int Max = arr[0];
		int Min = arr[0];

		for (int i = 0; i < n; i++) {
			if (Max < arr[i]) {
				Max = arr[i];
			}
			if (Min > arr[i]) {
				Min = arr[i];
			}
		}
		System.out.println("Max Element = " + Max);
		System.out.println("Min Element = " + Min);
	}
}
