package Basic;

public class MarksOfSubjects {
	public static void main(String[] args) {
		double a = 80, b = 70, c = 74, d = 68, e = 85;

		double total = a + b + c + d + e;
		double average = total / 5;
		double percentage = (total / 500) * 100;
		
		System.out.println("Total = " + total);
		System.out.println("Average = " + average);
		System.out.println("Percentage = " + percentage + " %");
	}
}
