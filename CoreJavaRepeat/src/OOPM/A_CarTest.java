package OOPM;

public class A_CarTest {
	public static void main(String[] args) {
		A_Car nano = new A_Car();
		
		nano.setColor("Red");
		nano.setGear(3);
		nano.accelarator();
		nano.accelarator();
		nano.accelarator();
		nano.pressBreak();
		
		
		System.out.println("Car Details are : ");
		System.out.println("Color = " + nano.getColor() + "   " + "Gear = " + nano.getGear());
		System.out.println("Speed = " + nano.getSpeed());
	}
}
