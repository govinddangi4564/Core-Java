package OOP;

public class Test {
	public static void main(String[] args) {
		int arr[] = { 2, 8, 3, 1, 10, 5 };
		int max = arr[0];
		int sl = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(max < arr[j]) {
					max = arr[j];
				}
				if(sl <= max || sl > arr[j]) {
					sl = arr[j];
				}
			}
		}
		System.out.println(max);
		System.out.println(sl);
	}
}
