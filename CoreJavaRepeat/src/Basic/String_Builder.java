package Basic;

public class String_Builder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);

//		char at index 
		System.out.println(sb.charAt(0));

//		set char at index 
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		
		sb.insert(0, 'S');
		System.out.println(sb);
		
		sb.delete(1, 2);
		System.out.println(sb);
		
		sb.append("y");
		System.out.println(sb);
	}

}
