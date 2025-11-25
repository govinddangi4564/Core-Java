package OOPM.Inheritance;

public class C_RBITest {
	public static void main(String[] args) {
		Icici ic = new Icici();
		Sbi sb = new Sbi();
		Canara ca = new Canara();
		Hdfc hd = new Hdfc();

		ic.setName("ICICI");
		ic.setBranch("Vijyanagar");
		ic.setLocation("Indore");
		ic.setIfsc("icicc1023");

		sb.setName("SBI");
		sb.setBranch("P.T Company");
		sb.setLocation("Rajgarh");
		sb.setIfsc("sbi789453");

		ca.setName("Canara");
		ca.setBranch("Karedi");
		ca.setLocation("Karedi");
		ca.setIfsc("canra7410");

		hd.setName("HDFC");
		hd.setBranch("Nadra");
		hd.setLocation("Bhopal");
		hd.setIfsc("hdfc8522");

		System.out.println("ICICI Bank Details...................");
		System.out.println("   " + ic.getName() + "   " + ic.getBranch() + "   " + ic.getIfsc() + "   " + ic.getLocation());

		System.out.println("SBI Bank Details...................");
		System.out.println("   " + sb.getName() + "   " + sb.getBranch() + "   " + sb.getIfsc() + "   " + sb.getLocation());

		System.out.println("Canara Bank Details...................");
		System.out.println("   " + ca.getName() + "   " + ca.getBranch() + "   " + ca.getIfsc() + "   " + ca.getLocation());

		System.out.println("HDFC Bank Details...................");
		System.out.println("   " + hd.getName() + "   " + hd.getBranch() + "   " + hd.getIfsc() + "   " + hd.getLocation());
	}
}
