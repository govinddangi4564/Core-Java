package OOP;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String display() {
		return day + "/" + month + "/" + year;
	}

	public static void main(String[] args) {
		Date dt = new Date(10, 5, 2000);

		System.out.println("Date : " + dt.display());

		dt.setDay(21);
		dt.setMonth(7);
		dt.setYear(2003);

		System.out.println("New Date : " + dt.display());
	}

}
