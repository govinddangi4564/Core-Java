package Basic;

public class TestBuffer {
	public static void main(String arg[]) {
		// String buffer is a mutable class--changeable

		StringBuffer sb = new StringBuffer("Rocky Bhai");
		System.out.println("capacity :" + sb.capacity());
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("Bhai"));
		System.out.println(sb.replace(6, 10, "Bahin"));
		System.out.println(sb.charAt(0));
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(0));
		System.out.println(sb.append(" Zindabad"));
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Infoviaan Techno");
		System.out.println(sb.capacity());
		System.out.println("-------------------------------------------------");
		StringBuilder s = new StringBuilder("Damyanti");
		System.out.println("capacity : " + s.capacity());

	}
}
