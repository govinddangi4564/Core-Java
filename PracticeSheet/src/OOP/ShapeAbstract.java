package OOP;

abstract class Shape {
	abstract double area();

	abstract double perimeter();
}

class Rectangle extends Shape {
	double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return width * length;
	}

	@Override
	double perimeter() {
		return 2 * (length + width);
	}
}

class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	double perimeter() {
		return 2 * Math.PI * radius;
	}
}

class Triangle extends Shape {
	double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	double area() {
		double s = (a + b + c) / 2; // semi-perimeter
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	double perimeter() {
		return a + b + c;
	}

}

public class ShapeAbstract {
	public static void main(String[] args) {

		Shape rec = new Rectangle(15.0, 10.0);
		Shape ci = new Circle(12.0);
		Shape tri = new Triangle(10.0, 22.0, 35.0);

		System.out.println("Rectangle Area: " + rec.area());
		System.out.println("Rectangle Perimeter: " + rec.perimeter());

		System.out.println("Circle Area: " + ci.area());
		System.out.println("Circle Perimeter: " + ci.perimeter());

		System.out.println("Triangle Area: " + tri.area());
		System.out.println("Triangle Perimeter: " + tri.perimeter());

	}
}