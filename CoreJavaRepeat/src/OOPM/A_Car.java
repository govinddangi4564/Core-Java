package OOPM;

public class A_Car {
	private String color;
	private int gear;
	private int speed;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void accelarator() {
		speed += 15;
	}
	
	public void pressBreak() {
		speed -= 20;
	}
	
	public int getSpeed() {
		return speed;
	}
}
