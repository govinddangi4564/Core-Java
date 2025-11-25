package Inheritence;

import java.util.Scanner;

public class testshape {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		 circle c=new circle();
		 c.setColor("red");
		 System.out.println(" **********------ Circle ------*************");
		 System.out.print("Enter Radius of circle : ");
		 double radius = sc.nextDouble();
		 double areaofcircle = 3.14*radius *radius;
		 System.out.println("Area of Circle : "+areaofcircle);
		 System.out.println("Colour of Circle = "+c.getColor());
		 
		 System.out.println(" ************--- Triangle ----**************");
		 Triangle t=new Triangle();
		 t.setColor("Blue");
		 System.out.print("Enter base of Triangle :");
		 int base =sc.nextInt();
		 System.out.print("Enter height of Triangle :  ");
		 int height = sc.nextInt();
		double area = 0.5*base*height;
		System.out.println("Area of Triangle : "+area);
		System.out.println("Colour of Triangle = "+t.getColor());
		
		 System.out.println(" ************--- Rectangle ----**************");
		 Rectangle r =new Rectangle ();
		 r.setColor("Green");
		 System.out.println("Enter length of Rectangle :");
		 int length =sc.nextInt();
		 System.out.println("Enter width of Rectangle :  ");
		 int width = sc.nextInt();
		double areaR = length * width;
		System.out.println("Area of Rectangle : "+areaR);
		System.out.println("Colour of Rectangle = "+r.getColor());
		
		
		 
	}

}
