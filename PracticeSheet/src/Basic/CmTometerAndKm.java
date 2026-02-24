package Basic;

public class CmTometerAndKm {
	public static void main(String[] args) {
		int cm = 5000;
		
		double m = 0.01 * cm;
		double km = 0.00001 * cm;
		
		System.out.println("Meter = " + m);
		System.out.println("KiloMeter = " + km);
	}
}
