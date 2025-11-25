package OOPM.Interface1;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		Vehicle v3 = new Bus();

		v1.start();
		v1.stop();

		v2.start();
		v2.stop();

		v3.start();
		v3.stop();
	}
}
