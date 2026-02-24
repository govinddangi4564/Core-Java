package IfElse;

public class Height {
	public static void main(String[] args) {
		int height = 173;
		
		if(height > 172) {
			System.out.println("Taller");
		} else if(height > 165 && height < 173) {
			System.out.println("Medium");
		}else {
			System.out.println("Short height");
		}
	}
}
