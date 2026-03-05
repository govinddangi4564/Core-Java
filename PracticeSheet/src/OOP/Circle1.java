package OOP;

public class Circle1 {
	private double radius;

	public Circle1(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double area() {
		return Math.PI * radius * radius;
	}
	
	double circumference() {
		return 2 * Math.PI * radius;
	}
	
	public static void main(String[] args) {
		Circle1 ci = new Circle1(12.5);
		
		System.out.println("Area : " + ci.area());
		System.out.println("Perimeter : " + ci.circumference());
		
		ci.setRadius(10);
		
		System.out.println(ci.getRadius());
		System.out.println("Area : " + ci.area());
		System.out.println("Perimeter : " + ci.circumference());
	}

}
