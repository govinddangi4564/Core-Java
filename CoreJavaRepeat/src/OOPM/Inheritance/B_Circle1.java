package OOPM.Inheritance;

public class B_Circle1 extends B_Shape1 {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void area() {
		System.out.println("Circle area = " + Math.PI * radius * radius);
	}

}
