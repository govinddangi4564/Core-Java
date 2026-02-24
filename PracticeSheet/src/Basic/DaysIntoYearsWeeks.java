package Basic;

public class DaysIntoYearsWeeks {
	public static void main(String[] args) {
		int days = 525;
		
		int years = days / 365;
		int remainingDays = days % 365;
		
		int weeks = remainingDays / 7;
		int extraDays = remainingDays % 7;
		
		System.out.println("Years : " + years);
		System.out.println("Weeks : " + weeks);
		System.out.println("Days : " + extraDays);
	}
}
