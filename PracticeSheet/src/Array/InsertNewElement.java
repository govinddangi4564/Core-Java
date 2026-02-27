package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNewElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the new Element : ");
		int ele = sc.nextInt();

		System.out.println("Enter the position between 0 to " + n + " for new element : ");
		int pos = sc.nextInt();

		int[] newArr = new int[n + 1];

		for(int i = newArr.length - 1; i >= pos; i--) {
			newArr[i] = arr[i-1];
		}
		newArr[pos] = ele;
		
		for(int i=0; i<pos; i++) {
			newArr[i] = arr[i];
		}
		
//
//		newArr[pos] = ele;
//
//		for (int i = pos; i < n; i++) {
//			newArr[i] = arr[i];
//		}
//
////		for (int i = 0; i < newArr.length; i++) {
////			System.out.print(newArr[i] + " ");
////		}
//		
		System.out.println(Arrays.toString(newArr));
		
	}

}
