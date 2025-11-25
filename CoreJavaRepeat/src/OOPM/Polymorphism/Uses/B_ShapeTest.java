package OOPM.Polymorphism.Uses;

public class B_ShapeTest {

//	3. Polymorphism Using Method Return Type

	public static B_Shape getShape(int i) {
		if (i == 1) {
			B_Circle cc = new B_Circle(2.5);
			return cc;
		} else if (i == 2) {
//			B_Rectangle rr = new B_Rectangle(25, 11);
			return new B_Rectangle(25, 11);
		} else if (i == 3) {
			return new B_Triangle(14, 32);
		}

		return null;
	}
	
//	2. Polymorphism Using Method Argument
	
	public static double totalArea(B_Shape X[]) {
		double total = 0;
		for (B_Shape p : X) {
			total = total + p.area();
		}
		
		return total;
	}

	public static void main(String[] args) {

//	1. Polymorphism Using Array

		B_Shape[] ss = new B_Shape[3];
		ss[0] = new B_Circle(2.5);
		ss[1] = new B_Rectangle(25, 20);
		ss[2] = new B_Triangle(15, 33);

		System.out.println("Circle area : " + ss[0].area());
		System.out.println("Rectangle area : " + ss[1].area());
		System.out.println("Triangle area : " + ss[2].area());
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Total area of all shapes : " + totalArea(ss));
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Circle area : " + getShape(1).area());
		System.out.println("Rectangle area : " + getShape(2).area());
		System.out.println("Triangle area : " + getShape(3).area());
	}

}
