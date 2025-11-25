package OOPM.Interface;

public class A_PersonTest {
	public static void main(String[] args) {
		A_Richman rm = new A_Student();
		rm.earnMoney();
		rm.party();
		rm.donation();

		System.out.println("-----------------------------------");

		A_SocialWorker sw = new A_Student();
		sw.helpToOther();

		System.out.println("------------------------------------");

		A_Student st = new A_Student();
		st.setName("Govind");
		st.setAge(19);
		st.setAddress("Rajgarh");
		st.setMobile("+91 7067624564");
		st.setCourse("Java");
		st.setRollNo("0863CS123456");

		System.out.println(st.getName() + "  " + st.getAge() + "  " + st.getAddress() + "  " + st.getMobile() + "  "
				+ st.getCourse() + "  " + st.getRollNo());
		st.earnMoney();
		st.party();
		st.donation();
		st.helpToOther();
	}

}
