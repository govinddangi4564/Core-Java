package OOPM.Polymorphism;

public class Addition {
	public void add() {
		int a, b, c;
		a = 10;
		b = 90;
		c = a + b;

		System.out.println("Addition (No-argument) : " + c);
	}

	public void add(int x, int y) {
		int z = x + y;
		System.out.println("Addition (2 int argument) : " + z);
	}

	public void add(int x, int y, int z) {
		int a = x + y + z;
		System.out.println("Addition (3 int argument) : " + a);
	}

	public void add(double x, double y) {
		double z = x + y;
		System.out.println("Addition (2 double argument) : " + z);
	}

	public void add(String x, int y) {
		String z = x + y;
		System.out.println("Addition (String int argument) : " + z);
	}
	
	public static void main(String[] args) {
		Addition obj = new Addition();
		
		obj.add();
		obj.add(88, 20);
		obj.add(20, 85, 21);
		obj.add(23.85, 70.14);
		obj.add(10, 10.2);
		obj.add("Hello", 120);
	}
}

