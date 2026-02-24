package Switch;

public class EvenToOdd {
	public static void main(String[] args) {
		int num = 11;
		
		switch(num % 2) {
		
		case 0:
			num = num + 1;
			System.out.println("Upper nearest odd number = " + num);
			break;
			
		case 1:
			System.out.println("Number is already odd.");
			break;
		}
	}
}
