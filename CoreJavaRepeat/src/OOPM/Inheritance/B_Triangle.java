package OOPM.Inheritance;

public class B_Triangle extends B_Shape {
	private double height, base;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return base;
	}

	public void setWidth(double width) {
		this.base = width;
	}

	public void area() {
		double ar = 0.5 * base * height;
		System.out.println("Triangle area = " + ar);
	}

}
