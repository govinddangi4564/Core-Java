package OOPM.Polymorphism.Uses;

public class B_Circle extends B_Shape {
	private double radius;

	public B_Circle() {
		
	}
	
 	public B_Circle(double radius){
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
