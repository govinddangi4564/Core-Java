package OOPM.Inheritance.Constructor;

public class B_Triangle extends B_Shape{
	private double base, height;
	
	
	public B_Triangle() {
		
	}

	public B_Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public void area() {
		System.out.println("Triangle area : " + 0.5 * base * height);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
