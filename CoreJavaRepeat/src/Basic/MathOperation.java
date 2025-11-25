package Basic;

public class MathOperation {
	public static void main(String[] args) {

		System.out.println(Math.min(236, 987));
		System.out.println(Math.max(856, 789));
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.TAU);
		System.out.println(Math.log10(10));
		System.out.println(Math.abs(-256.5412));
		System.out.println(Math.sin(85));
		System.out.println(Math.addExact(85, 10));
		System.out.println(Math.subtractExact(85, 10));
		System.out.println(Math.multiplyExact(74, 10));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.ceil(25.3));
		System.out.println(Math.floor(25.3));
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);

		int d = (int) (Math.random() * 10);
		System.out.println(d);

		int r = (int) (Math.random() * 1000000); // its wrong way
		System.out.println(r);

		String otp = "";
		for (int i = 1; i <= 6; i++) {
			int o = (int) (Math.random() * 10);
			otp = otp + o;
		}
		System.out.println("Otp : " + otp);
		
//		Captch
		
		String alpha = "ASCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		String captcha = "";
		for(int i=1; i<=3; i++) {
			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 52);
			captcha = captcha + a + alpha.charAt(b);
		}
		
		System.out.println("Captcha : " + captcha);

	}
}
