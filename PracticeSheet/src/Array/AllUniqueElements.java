package Array;

import java.util.Scanner;

public class AllUniqueElements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Unique elements are:");

		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
