package Inheritence;

import java.util.Scanner;

import javax.sound.midi.spi.SoundbankReader;

public class studentmain  extends student1{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println(" Enter the name : ");
		String nam = s.nextLine();
		
		System.out.println(" Enter Age : ");
		int age=s.nextInt();
		
		System.out.println("Enter Roll number : ");
		String roll =s.next();
		
		System.out.println("Enter Roll code: ");
		int rollcode=s.nextInt();
		
		System.out.println("Enter MObile Number : ");
		String mobilenumber =s.next();

		 
		System.out.println("Enter your class Section : ");
		String section=s.next();
		
		
		System.out.println(" **************************** RESULT  **********************");
		
		System.out.println(nam);
		System.out.println(age);
		System.out.println(roll);
		System.out.println(rollcode);
		System.out.println(mobilenumber);
	    System.out.println(section);
//	student s =new student();
//		s.setName("Rizwan Sheikh");
//		s.setRollno("0863CS231134");
//		s.setAge(20);
//		
//		student1  s1= new student1();
//		s1.setName("Safan Sheikh");
//		s1.setRollno("0662CS518412");
//		s1.setRollcode(2562265);
//		s1.setSection("C");
//		s1.setAge(15);
//		s1.setMobilenumber("9617277968");
//		
//		System.out.println(s1.getName()+" "+s1.getRollno()+" "+s1.getRollcode()+
//		" "+s1.getSection()+" "+s1.getAge()+" "+s1.getMobilenumber());
//		System.out.println("*******************-------------------***********************************************");
//		
//		System.out.println(s.getName()+" "+s.getRollno()+" "+s.getAge());
	}

}
