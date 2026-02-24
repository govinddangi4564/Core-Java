package Basic;

import java.util.Date;

public class DOBandMobile {
	public static void main(String[] args) {
		
		int birthYear = 2006;
		int birthMonth = 7; 
		int birthDay = 17;
		
		@SuppressWarnings("deprecation")
		Date birthDate = new Date(birthYear - 1900, birthMonth, birthDay);
        
        System.out.println(birthDate);
        
        System.out.println("Mobile number = 7067624564");
	}
}
