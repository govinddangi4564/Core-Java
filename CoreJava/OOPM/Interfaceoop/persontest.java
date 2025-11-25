package Interfaceoop;

public class persontest {
	public static void main(String[] args) {

		Richmen rm = new Student();
		rm.earnMoney();
		rm.Party();
		rm.donation();

		SocialWorker sw = new Student();
		sw.helptoOther();

		Student st = new Student();
		st.setName("Rizwan Sheikh");
		st.setAge(20);
		st.setRollNo("0863CS231134");
		st.setCourse("B.Tech");
		st.setMobile("9617277968");
		st.setAddress("Indore");

		System.out.println("------------ Students  Details : -------------------");
		System.out.println();
		System.out.println("Name         : " + st.getName());
		System.out.println("Age          : " + st.getAge());
		System.out.println("Roll Number  : " + st.getRollNo());
		System.out.println("Course       : " + st.getCourse());
		System.out.println("Mobile Number: " + st.getMobile());
		System.out.println("Address      : " + st.getAddress());

		st.earnMoney();
		st.Party();
		st.donation();
		st.helptoOther();
		System.out.println(" ******************* End ******************* ");
		System.out.println(" ***************----------Businessmen : ---------******************** ");
		Richmen rb = new Businessmen();
		rb.earnMoney();
		rb.Party();
		rb.donation();
		System.out.println(" *******************------------Teacher : ------------**********************");
		SocialWorker swt = new Teacher();
		swt.helptoOther();

	}
}
