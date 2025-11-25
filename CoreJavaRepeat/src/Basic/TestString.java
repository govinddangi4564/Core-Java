package Basic;

public class TestString {
	public static void main(String arg[]) {
		String name = "vijay deenanath chauhan";
		// String mm=new String("Ajay Deenanath chauhan")
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(6));
		System.out.println(name.indexOf('D'));
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.contains("nana"));
		System.out.println(name.concat(" Agneepath"));
		System.out.println(name);
		System.out.println(name.replace('a', '@'));
		System.out.println(name.replaceAll("na", "GUDDU"));
		System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name);
		System.out.println(name.startsWith("vij"));
		System.out.println(name.endsWith("han"));
	}
}
